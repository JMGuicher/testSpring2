package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= "co.simplon.crud")
public class TestSpring2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestSpring2Application.class, args);
	}
}
