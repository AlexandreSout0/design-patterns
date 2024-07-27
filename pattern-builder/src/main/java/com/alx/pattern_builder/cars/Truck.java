package com.alx.pattern_builder.cars;

import com.alx.pattern_builder.components.Transmission;
import com.alx.pattern_builder.components.CarType;
import com.alx.pattern_builder.components.Engine;

public class Truck {

    private final CarType carType;
    private int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += " Transmission: " + transmission;
        return truck;
    }
}
