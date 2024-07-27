package com.alx.pattern_builder.cars;

import com.alx.pattern_builder.components.CarType;
import com.alx.pattern_builder.components.Color;
import com.alx.pattern_builder.components.Engine;
import com.alx.pattern_builder.components.Transmission;

public class SportCar {

    private final CarType carType;
    private final int seats;
    private final Color color;
    private final Engine engine;
    private final Transmission transmission;

    public SportCar(CarType carType, int seats, Color color, Engine engine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        return "SportCar with motor: " + engine.getPower() + " Transmission: " + transmission + " " + "color: " + color;
    }
}