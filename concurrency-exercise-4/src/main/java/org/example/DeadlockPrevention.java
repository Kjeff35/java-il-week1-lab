package org.example;

public class DeadlockPrevention {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Runnable task = () -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + ": Locked resource 1");

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + ": Locked resource 2");
                }
            }
        };

        // Thread 1
        Thread t1 = new Thread(task, "Thread 1");

        // Thread 2
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}