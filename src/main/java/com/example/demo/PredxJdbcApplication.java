package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PredxJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PredxJdbcApplication.class, args);
	}

}
