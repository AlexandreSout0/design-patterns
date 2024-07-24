package com.alx.open_close.vehicles;

public class Car extends Vehicle{
    private int seats;

    public Car(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void configureCar(){
        System.out.println("Criando um carro - Cor: "+ color+ " Ano:" + year+ "Motor:" + engine + " Com: " + seats);
        startVehicle();
    }
}
