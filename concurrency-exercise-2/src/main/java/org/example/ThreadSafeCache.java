package org.example;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCache<K, V> {
    private final ConcurrentHashMap<K,V> cache = new ConcurrentHashMap<>();

    public void put(K key, V value){
        cache.put(key, value);
    }

    public V get(K key){
        return cache.get(key);
    }

    public void remove(K key){
        cache.remove(key);
    }

    public void clear(){
        cache.clear();
    }

    public int size(){
        return cache.size();
    }

    public boolean containsKey(K key) {
        return cache.containsKey(key);
    }
}
