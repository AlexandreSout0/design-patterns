package com.alx.factory_method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	private static Transport transport;
	public static void main(String[] args) {
		//SpringApplication.run(FactoryMethodApplication.class, args);
		configure(args[0]);
		if(transport != null){
			runTransport();
		}
	}

	private static void runTransport() {
		transport.startTransport();
	}

	private static void configure(String type) {
		switch(type){
			case "user":
				transport = new CarTransport();
				break;
			case "log":
				transport = new MotorcycleTransport();
			default:
				System.out.println("Selecione o tipo de entrega");
		}
	}

}
