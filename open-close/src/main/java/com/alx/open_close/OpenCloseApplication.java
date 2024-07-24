package com.alx.open_close;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Type;

@SpringBootApplication
public class OpenCloseApplication {

	public static void main(String[] args) {
		final TypeVehicle typeVehicle = TypeVehicle.CAR;

		SpringApplication.run(OpenCloseApplication.class, args);
		if(typeVehicle == TypeVehicle.CAR){
			Vehicle vehicle = new Vehicle("Azul", "2021", 2.0, 4);
			vehicle.car();
		}
	}



}
