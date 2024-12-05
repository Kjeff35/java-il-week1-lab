package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {
    public static void readFile(String fileName) {
        BufferedReader reader = null;

        try {
            // Try to open the file for reading
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(fileName);
            if (inputStream == null) {
                throw new FileNotFoundException("File not found in resources: " + fileName);
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            // Read lines from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle potential IOException while reading the file
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            // Ensure the file is closed regardless of whether an exception occurred or not
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        readFile("file.txt");
    }
}