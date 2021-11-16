package com.ntt.cliente.rest.ServiceRestEveris;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceRestEverisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRestEverisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestControllerService rest = new RestControllerService();
		Thread hilo1 = new Thread();
		
		rest.statusClose();
	}

}
