package com.company.conference.conferencedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorCompleteServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService WORKER_THREAD_POOL = Executors.newFixedThreadPool(10);
        CompletionService<String> service
                = new ExecutorCompletionService<>(WORKER_THREAD_POOL);
        List<Callable<String>> callables=Arrays.asList(ExecutorCompleteServiceExample::slow_function,
                ExecutorCompleteServiceExample::fast_function);

run_and_wait(callables, WORKER_THREAD_POOL, service);

    }
    public static String slow_function() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("slow function");
        return "slow_function";
    }
    public static String fast_function() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("fast function");
        return "fast_function";
    }
    public static void run_and_wait(List<Callable<String>> callables,ExecutorService WORKER_THREAD_POOL,CompletionService<String> service) throws ExecutionException, InterruptedException {

        List<Future<String>> results=new ArrayList<Future<String>>();
        for (Callable<String> callable : callables) {
            results.add(service.submit(callable));
        }
        if(results.size()==2)
        {
            for (Future<String> result:results
            ) {
                System.out.println(result.get());

            }
            System.out.println("All threads execution completed");
            WORKER_THREAD_POOL.shutdown();
        }


    }
}
