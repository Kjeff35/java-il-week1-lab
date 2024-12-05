package org.example;

public class Main {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        // Create multiple threads to increment the counter
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                sharedCounter.incrementCounter();
                try {
                    Thread.sleep((long) (Math.random() * 500));
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted.");
                }
            }
        };

        // Create and start threads
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Final counter value: " + sharedCounter.getCounter());
    }
}