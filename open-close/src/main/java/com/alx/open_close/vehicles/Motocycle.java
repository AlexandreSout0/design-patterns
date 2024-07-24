package com.alx.open_close.vehicles;

public class Motocycle extends Vehicle {
    public Motocycle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
    }
    public void configureMotocycle(){
        System.out.println("Criando uma moto - Ano:" +year + "Motor:" + engine );
        startVehicle();
    }
}
