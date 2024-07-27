package com.alx.pattern_builder;

import com.alx.pattern_builder.builders.CarBuilder;
import com.alx.pattern_builder.builders.SportCarBuilder;
import com.alx.pattern_builder.builders.TruckBuilder;
import com.alx.pattern_builder.cars.Car;
import com.alx.pattern_builder.cars.SportCar;
import com.alx.pattern_builder.cars.Truck;
import com.alx.pattern_builder.director.Director;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternBuilderApplication.class, args);

		Director director = new Director();

		CarBuilder builder = new CarBuilder();
		director.constructSedanCar(builder);

		Car car = builder.getResult();
		System.out.println(car.getCarType() + " produzido com sucesso!");
		System.out.println("Selecione o tipo de entrega");

		TruckBuilder truckBuilder = new TruckBuilder();
		director.constructTruck(truckBuilder);

		Truck truck = truckBuilder.getResult();
		System.out.println("Caminhão: " +truck.result());

		SportCarBuilder sportCarBuilder = new SportCarBuilder();
		director.constructorSportCar(sportCarBuilder);
		SportCar sportCar = sportCarBuilder.getResult();
		System.out.println("SportCar: " + sportCar.result());






	}




}
