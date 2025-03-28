package com.company.conference.conferencedemo;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main thread.");

        Thread firstThread = new Thread(() -> {
            System.out.println("First thread is running.");
        });

        Thread secondThread = new Thread(() -> {
            System.out.println("Second thread is running.");
        });

        secondThread.start();;
        firstThread.start();

        secondThread.join();
        firstThread.join();

        System.out.println("End main thread.");
    }
}
