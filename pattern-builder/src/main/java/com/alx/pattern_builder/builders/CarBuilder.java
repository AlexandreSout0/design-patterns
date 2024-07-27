package com.alx.pattern_builder.builders;

import com.alx.pattern_builder.components.Color;
import com.alx.pattern_builder.components.Transmission;
import com.alx.pattern_builder.cars.Car;
import com.alx.pattern_builder.components.CarType;
import com.alx.pattern_builder.components.Engine;

public class CarBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Color color;
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Car getResult(){
        return new Car(carType,seats,engine,transmission);
    }
}
