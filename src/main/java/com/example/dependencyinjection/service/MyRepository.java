package com.example.dependencyinjection.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyRepository {
	
	// Creating the constructor
	public MyRepository() {
		System.out.println("Repository created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Repository initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Repository destroy");
	}

}
