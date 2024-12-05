package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCache<String, Integer> threadSafeCache = new ThreadSafeCache<>();

        // Task for writing key-value pairs to the cache
        Runnable  writerTask = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "key " + i;
                Integer value = i;
                threadSafeCache.put(key, value);
                System.out.println("Put: " + key + " = " + value);
                try {
                    TimeUnit.MILLISECONDS.sleep(75);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Task for reading key-value pairs from the cache
        Runnable readerTask = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "key " + i;
                Integer value = threadSafeCache.get(key); // Retrieve from cache
                System.out.println("Reader Thread - Get: " + key + " = " + (value != null ? value : "[Not Found]"));
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Create threads for writer and reader tasks
        Thread writerThread = new Thread(writerTask);
        Thread readerThread = new Thread(readerTask);

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to complete
        writerThread.join();
        readerThread.join();

        // Print final cache size
        System.out.println("Final Cache Size: " + threadSafeCache.size());

    }
}