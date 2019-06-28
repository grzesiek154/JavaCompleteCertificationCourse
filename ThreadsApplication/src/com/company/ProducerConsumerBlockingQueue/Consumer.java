package com.company.ProducerConsumerBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {



    BlockingQueue<Integer> questionsQueue;

    public Consumer(BlockingQueue<Integer> questionsQueue) {
        this.questionsQueue = questionsQueue;
    }


    @Override
    public void run() {

        try {
            System.out.println("Abswered question: " + questionsQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
