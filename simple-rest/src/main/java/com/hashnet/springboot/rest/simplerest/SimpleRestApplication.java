package com.hashnet.springboot.rest.simplerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleRestApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SimpleRestApplication.class, args);
	
		System.out.println("All loaded beans:");
		for(String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
