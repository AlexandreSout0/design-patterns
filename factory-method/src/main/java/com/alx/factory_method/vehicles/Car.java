package com.alx.factory_method.vehicles;

public class Car implements VehicleImp{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto.");

    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageitos, estamos prontos.");
    }
}
