package com.lifdev.design_patterns_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class DesignPatternsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsDemoApplication.class, args);
	}

}
