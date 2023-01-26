package com.ista.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class ExamenPracticoM5BApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenPracticoM5BApplication.class, args);
	}

}
