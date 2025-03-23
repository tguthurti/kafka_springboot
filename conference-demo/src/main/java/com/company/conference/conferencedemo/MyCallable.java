package com.company.conference.conferencedemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Reptile> {
    @Override
    public Reptile call() throws Exception {
        return new FireDragon();
    }
}
