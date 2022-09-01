package com.revature.demos;

public class MultithreadedJava {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.currentThread().setPriority(10);
                System.out.println("i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        t1.run(); // Does not run in a separate thread, runs in the current thread
        t1.start();

        System.out.println("Main thread ended");
    }

}
