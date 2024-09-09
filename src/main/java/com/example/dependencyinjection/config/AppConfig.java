package com.example.dependencyinjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Classpath is defaulted to src/main/resources
@Configuration
@ComponentScan(basePackages = "com.example.dependencyinjection.service")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
