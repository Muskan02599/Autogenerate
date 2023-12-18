package com.example.Autogenerate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AutogenerateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutogenerateApplication.class, args);
	}

}
