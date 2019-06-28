package com.company.ProducerConsumerBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    int questionNo;
    BlockingQueue<Integer> questionsQueue;

    public Producer(BlockingQueue<Integer> questionsQueue) {
        this.questionsQueue = questionsQueue;
    }

    @Override
    public void run() {


        try {
            synchronized(this) {
                int nextQuestion = questionNo++;
                questionsQueue.put(nextQuestion);
                System.out.println("Got new question: " + nextQuestion);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
