package org.example.products.impl;

import org.example.products.Vehicle;

public class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a car...");
    }
}
