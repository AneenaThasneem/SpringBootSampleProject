package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstApplication {
	@Autowired
	private Aneena aneena;

	public static void main(String[] args) {
		SpringApplication.run(MyfirstApplication.class, args);



	}

    @Autowired
	public void printFamily() {
		// Print the family field from the Aneena class
		System.out.println("Family name: " + aneena.getFamily());
	}
}
