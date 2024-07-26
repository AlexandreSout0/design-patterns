package com.alx.factory_method;

import com.alx.factory_method.vehicles.Motorcycle;
import com.alx.factory_method.vehicles.VehicleImp;

public class MotorcycleTransport extends Transport{
    @Override
    protected VehicleImp createTransport() {
        return new Motorcycle();
    }
}
