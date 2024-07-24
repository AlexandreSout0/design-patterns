package com.alx.open_close;

public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car(){
        System.out.println("Criando um carro - Cor: "+ color+ " Ano:" + year+ "Motor:" + engine + " Com: " + seats);
        startVehicle();
    }

    void motocycle(){
        System.out.println("Criando uma moto - Ano:" +year + "Motor:" + engine );
    }

    void startVehicle(){
        System.out.println("Ligando os motores");
    }

}
