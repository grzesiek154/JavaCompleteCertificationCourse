package com.company.Synchronized;

public class Sequence {

    private int val = 0;

    public synchronized int getNext(){

            val = val +3;
            return val;

    }
}
