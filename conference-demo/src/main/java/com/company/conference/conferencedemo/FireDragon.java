package com.company.conference.conferencedemo;

import java.util.concurrent.Callable;

public class FireDragon implements Reptile {

    @Override
    public ReptileEgg lay() throws Exception {
        Callable<Reptile> callable=new MyCallable();
        return new ReptileEgg(ReptileEgg::hatch);
    }
    public static void main(String[] args) throws Exception {
        FireDragon dragon=new FireDragon();
        dragon.lay();
        dragon.lay();
        System.out.println(dragon instanceof Reptile);
    }

}
