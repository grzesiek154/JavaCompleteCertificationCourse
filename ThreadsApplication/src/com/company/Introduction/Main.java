package com.company.Introduction;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Starting thread 1");
        Thread t1 = new Thread(new Task("Thread A"));
        t1.start();

        // implementaca za pomoca klasy anonimowej
        System.out.println("Starting thread 2");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 1000; i++){
                    System.out.println("number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();

        Task2 taskRunner = new Task2("Thread C");
        taskRunner.start();
    }
}






// za pomoca interfejsu runnable
class Task implements Runnable {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.name);
        for(int i =0; i < 1000; i++){
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


// poprzez rozszezenie klasy Thread
class Task2 extends Thread {

    private String name;

    public Task2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.name);
        for(int i =0; i < 1000; i++){
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
