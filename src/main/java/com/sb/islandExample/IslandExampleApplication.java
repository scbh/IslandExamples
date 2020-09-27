package com.sb.islandExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IslandExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IslandExampleApplication.class, args);
		//SpringApplication.run(IslandExampleApplication.class, args);
	}

}
