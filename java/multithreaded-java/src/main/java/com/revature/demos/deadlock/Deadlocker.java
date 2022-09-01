package com.revature.demos.deadlock;

public class Deadlocker {

    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public synchronized void instanceLocked() {
        System.out.println("For synchronized method signatures the lock is held by this instance");
    }

    public static synchronized void classLocked() {
        System.out.println("For static synchronized method signatures the lock is held by class itself");
    }

    public void methodA() {
        synchronized (lockA) {
            System.out.printf("[%s] is running inside of methodA()\n", Thread.currentThread().getName());
            methodB();
        }
    }

    public void methodB() {
        synchronized (lockB) {
            System.out.printf("[%s] is running inside of methodB()\n", Thread.currentThread().getName());
            methodC();
        }
    }

    public void methodC() {
        synchronized (lockA) {
            System.out.printf("[%s] is running inside of methodC()\n", Thread.currentThread().getName());
        }
    }

}
