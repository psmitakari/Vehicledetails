package com.lti.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleLoanApplication.class, args);
		System.out.println("...Go ahead It's working...");
	}

}
