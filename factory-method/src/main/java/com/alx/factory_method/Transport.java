package com.alx.factory_method;

import com.alx.factory_method.vehicles.VehicleImp;

public abstract class Transport {

    void startTransport(){
        VehicleImp vehicle = createTransport();
        vehicle.startRoute();
    }
    protected abstract VehicleImp createTransport();

}
