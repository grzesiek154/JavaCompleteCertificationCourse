package com.company.ProducerConsumerBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

    public static void main(String[] args) {



        BlockingQueue<Integer> questionsQueue = new ArrayBlockingQueue<>(5);

        Thread t1 = new Thread(new Producer(questionsQueue));
        Thread t2 = new Thread(new Consumer(questionsQueue));


    }
}
