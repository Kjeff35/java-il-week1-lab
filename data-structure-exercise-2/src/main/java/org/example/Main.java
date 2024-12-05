package org.example;

public class Main {
    public static void main(String[] args) {
        MinHeap taskHeap = new MinHeap(10);

        taskHeap.insert(new Task("Task A", 3));
        taskHeap.insert(new Task("Task B", 1));
        taskHeap.insert(new Task("Task C", 2));
        taskHeap.insert(new Task("Task D", 5));
        taskHeap.insert(new Task("Task E", 4));

        System.out.println("Task Heap:");
        taskHeap.printHeap();

        System.out.println("\nScheduling Tasks:");
        while (!taskHeap.isEmpty()) {
            Task task = taskHeap.extractMin();
            System.out.println("Executing " + task);
        }
    }
}