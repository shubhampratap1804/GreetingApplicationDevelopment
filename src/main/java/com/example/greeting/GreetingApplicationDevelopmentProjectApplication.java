package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplicationDevelopmentProjectApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to the greeting application development!");
		SpringApplication.run(GreetingApplicationDevelopmentProjectApplication.class, args);
	}
}
