package org.example.creator;

import org.example.products.Vehicle;
import org.example.products.impl.Motorcycle;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
