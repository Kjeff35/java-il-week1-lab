package org.example;

import org.example.creator.CarFactory;
import org.example.creator.MotorcycleFactory;
import org.example.creator.VehicleFactory;
import org.example.products.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.manufacture();
    }
}