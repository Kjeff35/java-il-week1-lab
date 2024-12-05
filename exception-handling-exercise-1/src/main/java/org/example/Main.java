package org.example;

public class Main {

    // Method to demonstrate throwing a checked exception
    public static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception");
    }

    // Method to demonstrate throwing an unchecked exception
    public static void throwUncheckedException() {
        throw new RuntimeException("This is an unchecked exception");
    }
    public static void main(String[] args) {
        // Handling checked exception
        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        // Handling unchecked exception
        try {
            throwUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }
    }
}