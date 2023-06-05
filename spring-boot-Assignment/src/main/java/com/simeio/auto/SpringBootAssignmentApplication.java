package com.simeio.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

	@Autowired
	private Restaurant restaurant;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------------Indian--------------------- ");
		restaurant.displayMenu("indian").forEach(System.out::println);
		System.out.println("-------------------Chinese------------------------ ");
		restaurant.displayMenu("chinese").forEach(System.out::println);
		System.out.println("------------------Continental----------------------- ");
		restaurant.displayMenu("continental").forEach(System.out::println);
	}

}
