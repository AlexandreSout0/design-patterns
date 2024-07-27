package com.alx.pattern_builder.cars;

import com.alx.pattern_builder.components.Transmission;
import com.alx.pattern_builder.components.CarType;
import com.alx.pattern_builder.components.Engine;

public class Car {

    private final CarType carType;
    private int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
