package com.dv.projectomongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ProjectoMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectoMongoApplication.class, args);
	}

}
