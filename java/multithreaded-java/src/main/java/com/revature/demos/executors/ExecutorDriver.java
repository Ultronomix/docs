package com.revature.demos.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDriver {

    public static void main(String[] args) {

        // Creating a thread using the Runnable pattern and creating an on-demand thread (very resource intensive)
        Runnable task_0 = () -> System.out.println("Hello, world!");
        Thread t1 = new Thread(task_0);
        t1.start();

        /*
            1. A thread is created on demand...by a developer
            2. Once the task is complete, the thread is terminated (it dies)
            3. Threads are expensive resources, and we should probably reuse them
            4. Runnable#run has no return value, and cannot raise exceptions
         */

//        Runnable task_1 = () -> {
//            throw new RuntimeException("Thrown from inside a Runnable lambda");
//        };
//
//        Thread t2 = new Thread(task_1);
//        try {
//            t2.start(); // the RuntimeException is never propagated to the main thread (therefore, never caught)
//        } catch (Exception e) {
//            System.out.println("We caught the exception! e = " + e);
//        }

        /*
            Executor Pattern

              - aims to improve the use of thread resources
                + by creating pools of ready-to-use, re-usable threads
                + Runnable tasks are given to existing threads in some pool
                + threads remain in the pool even after they finish the run logic

              - two required steps:
                + create a pool of threads
                + pass a task to a thread within the pool
         */

        ExecutorService threadExecutor = Executors.newFixedThreadPool(2);
        Runnable task_2 = () -> System.out.println("task_2 is running in " + Thread.currentThread().getName());
        Runnable task_3 = () -> System.out.println("task_3 is running in " + Thread.currentThread().getName());
        Runnable task_4 = () -> System.out.println("task_4 is running in " + Thread.currentThread().getName());

        threadExecutor.execute(task_2);
        threadExecutor.execute(task_3);
        threadExecutor.execute(task_4);

        System.out.println("main logic");

        threadExecutor.shutdown();

    }
}
