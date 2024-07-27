package com.alx.pattern_builder.director;

import com.alx.pattern_builder.components.Color;
import com.alx.pattern_builder.components.Transmission;
import com.alx.pattern_builder.builders.IBuilder;
import com.alx.pattern_builder.components.CarType;
import com.alx.pattern_builder.components.Engine;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(7);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructorSportCar(IBuilder builder) {
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(5000));
        builder.setColor(Color.AMARELO);
    }

}
