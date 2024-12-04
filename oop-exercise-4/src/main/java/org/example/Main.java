package org.example;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();

        // Push elements onto the stack
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        // Peek the top element
        System.out.println("Top element: " + intStack.peek());

        // Pop an element from the stack
        System.out.println("Popped element: " + intStack.pop());

        // Check the size of the stack
        System.out.println("Stack size: " + intStack.size());
    }
}