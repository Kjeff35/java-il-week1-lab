package org.example;

public class Stack<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void push(T element) {
        // Check if we need to resize the array
        if (size == elements.length) {
            resize(elements.length * 2);
        }
        elements[size++] = element;
    }

    // Resize the internal array when needed
    private void resize(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }


    // Pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = (T) elements[--size];
        elements[size] = null;  // Avoid memory leak
        return element;
    }

    // Peek the top element of the stack
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }
}
