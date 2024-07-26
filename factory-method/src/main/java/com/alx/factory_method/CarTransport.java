package com.alx.factory_method;

import com.alx.factory_method.vehicles.Car;
import com.alx.factory_method.vehicles.VehicleImp;

public class CarTransport extends Transport{
    @Override
    protected VehicleImp createTransport() {
        return new Car();
    }
}
