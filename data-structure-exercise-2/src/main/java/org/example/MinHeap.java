package org.example;

public class MinHeap {
    private Task[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new Task[capacity];
        size = 0;
    }

    // Helper method to get the parent index of a node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Helper method to get the left child index of a node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Helper method to get the right child index of a node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Helper method to swap two tasks
    private void swap(int i, int j) {
        Task temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert a task into the heap
    public void insert(Task task) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }

        heap[size] = task;
        int current = size;
        size++;

        // Heapify up to maintain heap property
        while (current > 0 && heap[current].priority < heap[parent(current)].priority) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Extract the task with the highest priority (smallest priority number)
    public Task extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return null;
        }

        Task root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Heapify down to restore heap property
        minHeapify(0);

        return root;
    }

    // Helper method to heapify down
    private void minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left].priority < heap[smallest].priority) {
            smallest = left;
        }

        if (right < size && heap[right].priority < heap[smallest].priority) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    // Return the task at the top of the heap without removing it
    public Task peek() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return null;
        }
        return heap[0];
    }

    // Check if the heap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all tasks in the heap (for debugging)
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.println(heap[i]);
        }
    }
}
