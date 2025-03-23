package com.company.conference.conferencedemo;

import java.util.ArrayList;
import java.util.List;

public class Platformer {
    int position;
    List<Integer> list=new ArrayList<Integer>();
    public Platformer(int n,int position)
    {
        this.position=position;
        for(int i=0;i<=n;i++)
        {
            list.add(i,i);
        }
    }
    public void jumpLeft()
    {
        //Moving 2 tiles left
        int temp=this.position;
        this.position+=-2;
        list.remove(temp);
    }
    public void jumpRight()
    {
        //Moving 2 tiles Right
        int temp=this.position;
        this.position+=2;
        list.remove(temp);
    }
    public int position()
    {
        return list.get(this.position);
    }
    public static void main(String[] args)
    {
        Platformer platformer=new Platformer(6,3);
        System.out.println(platformer.position());
    }
}
