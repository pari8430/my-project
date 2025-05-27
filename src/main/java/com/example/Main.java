package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.out.println("This is a new SpringBoot App");
		SpringApplication.run(Main.class, args);
	}

}
