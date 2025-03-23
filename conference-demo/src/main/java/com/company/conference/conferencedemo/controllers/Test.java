package com.company.conference.conferencedemo.controllers;

import java.util.HashMap;

public class Test {
    public static void main(String args[]) {
        String[] names =
                {"tulasi","bindu","tulasi","kumar","tulasi"
                };
        HashMap<String,Integer> h = new HashMap <String,Integer>();

        for(int i=0; i<names.length;i++ ){
            if(h.containsKey(names[i]))
            {
                h.put(names[i],h.get(names[i])+1);
            }else
            {
                h.put(names[i], 1);
            }
        }
        System.out.println(h);
    }

}
