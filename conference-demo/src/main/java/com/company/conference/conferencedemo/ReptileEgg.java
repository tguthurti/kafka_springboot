package com.company.conference.conferencedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ReptileEgg {
    ExecutorService WORKER_THREAD_POOL = Executors.newFixedThreadPool(10);
    CompletionService<Reptile> service
            = new ExecutorCompletionService<Reptile>(WORKER_THREAD_POOL);
    static List<Future<Reptile>> results = new ArrayList<Future<Reptile>>();

    public ReptileEgg(Callable<Reptile> callable) throws Exception {
        results.add(service.submit(callable));
    }

    public static Reptile hatch() throws IllegalStateException {
        System.out.println(results.size());
        if (results.size() >1) {
            throw new IllegalStateException("Same species should not hatch more than once");
        }
        return new FireDragon();
    }
}
