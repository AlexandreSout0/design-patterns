package com.alx.open_close.vehicles;

public class Car implements VehiclesCarImp{

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        ConfigureVehicle(color, year, engine, seats);
    }

    @Override
    public void ConfigureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Criando um carro com interface - Cor: "+ color+ " Ano:" + year+ "Motor:" + engine + " Com: " + seats);

        StartVehicle();
    }

    @Override
    public void StartVehicle() {
        System.out.println("Ligando os motores Interface!");
    }


//    private int seats;
//
//    public Car(String color, String year, double engine, int seats){
//        this.color = color;
//        this.year = year;
//        this.engine = engine;
//        this.seats = seats;
//    }
//
//    public void configureCar(){
//        System.out.println("Criando um carro - Cor: "+ color+ " Ano:" + year+ "Motor:" + engine + " Com: " + seats);
//        startVehicle();
//    }
}
