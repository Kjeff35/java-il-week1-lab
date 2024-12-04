package org.example.creator;

import org.example.products.Vehicle;
import org.example.products.impl.Car;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
