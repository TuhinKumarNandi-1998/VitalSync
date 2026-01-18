package com.vitalsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vitalsync")
public class VitalsyncHmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VitalsyncHmsApplication.class, args);
	}

}
