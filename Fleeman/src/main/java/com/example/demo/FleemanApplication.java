package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.services", "com.example.demo.repositories","com.example.demo.controllers"})
public class FleemanApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleemanApplication.class, args);
	}

}
