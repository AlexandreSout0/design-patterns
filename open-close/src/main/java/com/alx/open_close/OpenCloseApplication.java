package com.alx.open_close;

import com.alx.open_close.vehicles.Motocycle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Type;

@SpringBootApplication
public class OpenCloseApplication {

	public static void main(String[] args) {
		final TypeVehicle typeVehicle = TypeVehicle.MOTORCYCLE;

		SpringApplication.run(OpenCloseApplication.class, args);
		if(typeVehicle == TypeVehicle.CAR){
			//Vehicle vehicle = new Vehicle("Azul", "2021", 2.0, 4);
			//vehicle.car();
		}else if (typeVehicle == TypeVehicle.MOTORCYCLE){
			Motocycle motorcycle = new Motocycle("branca", "2022", 250);
		}
	}



}
