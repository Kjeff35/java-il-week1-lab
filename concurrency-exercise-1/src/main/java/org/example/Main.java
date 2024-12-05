package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads (e.g., 4 threads)
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        String[] imageFiles = {"image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg", "image6.jpg", "image7.jpg", "image8.jpg", "image9.jpg", "image10.jpg"};

        // Submit tasks to the executor for each image
        for (String imageName : imageFiles) {
            executorService.submit(new ImageProcessor(imageName));
        }

        executorService.shutdown();
    }
}