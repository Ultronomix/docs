package com.revature.demos.deadlock;

public class DeadlockDriver {

    public static void main(String[] args) throws InterruptedException {

        Deadlocker deadlocker = new Deadlocker();
        Runnable r1 = () -> deadlocker.methodA();
        Runnable r2 = deadlocker::methodB;

        Thread t1 = new Thread(r1); // t1 thread state = NEW
        t1.setName("t1");
        t1.start(); // t1 thread state = RUNNABLE

        Thread t2 = new Thread(r2);
        t2.setName("t2");
        t2.start();

        t1.join();
        t2.join();
    }

}
