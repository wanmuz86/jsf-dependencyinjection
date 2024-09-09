package com.example.dependencyinjection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyService {
	// @Value annotation - used to inject value from config file, 
	// system property or constant (from the config or resources)
	/// and expression
	// into a Bean
	@Value("#{systemProperties['user.name']}")	
	private String userName;
	
	@Value("${app.name}")
	private String appName;
	
	// split: transforming a string into List by separator (",")
	// ${} => Java code / similar to string concatenation -> The value of
	// #{} => SPeL code -> retrieve or perform the expression
	@Value("#{'${app.listOfNumber}'.split(',')}")
	private List<Integer> listOfNumbers;
	
	private final MyRepository repository;
	
	@Autowired
	public MyService(MyRepository repository) {
		this.repository = repository;
	}
	
	public void performService() {
		System.out.println("Service is performed using repository");
		System.out.println("Executed by "+userName);
		System.out.println("Retriving app name from property: "+appName );
		System.out.println("Retrieving number from property: "+listOfNumbers);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Service initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Service destroyed");
	}
	
	

}
