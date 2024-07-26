package com.alx.factory_method.vehicles;

public class Motorcycle implements VehicleImp{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o entrega.");

    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda");

    }
}
