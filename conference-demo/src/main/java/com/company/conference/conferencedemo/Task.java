package com.company.conference.conferencedemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{
    CyclicBarrier barrier;
    public Task(CyclicBarrier b)
    {
        this.barrier=b;
    }
    @Override
    public void run() {
        try {
            System.out.println("Thread : " + Thread.currentThread().getName() + " is waiting");
            barrier.await();
            System.out.println("Thread : " + Thread.currentThread().getName() + " is released");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
