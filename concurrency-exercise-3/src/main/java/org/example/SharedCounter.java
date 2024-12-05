package org.example;

public class SharedCounter {
    private int counter = 0;

    public void incrementCounter() {
        synchronized (this) { // Synchronized block to ensure thread safety
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        }
    }

    public int getCounter() {
        return counter;
    }
}
