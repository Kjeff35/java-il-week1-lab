package org.example;

class ImageProcessor implements Runnable {
    private final String imageName;

    public ImageProcessor(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void run() {
        try {
            long sleepTime = (long) (Math.random() * 5000);
            System.out.println(Thread.currentThread().getName() + " - Processing image: " + imageName + " waiting for " + sleepTime/1000.0 + " seconds to complete");
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() + " - Finished processing image: " + imageName);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Image processing interrupted for " + imageName);
        }
    }
}
