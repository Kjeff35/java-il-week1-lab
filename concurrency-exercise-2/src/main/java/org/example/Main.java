package org.example;

public class Main {
    public static void main(String[] args) {
        ThreadSafeCache<String, String> cache = new ThreadSafeCache<>();
        cache.put("key1", "1");
        cache.put("key2", "2");

        System.out.println("Cache contains key1: " +cache.containsKey("key1"));

        cache.clear();
        System.out.println("Cache size: " + cache.size());
    }
}