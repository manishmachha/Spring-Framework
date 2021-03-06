package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
//	@Scope(scopeName = "singleton") //all objects will be assigned with same values if property value of one object is set
	@Scope(scopeName = "prototype") //property value of one object is set and property values of other objects will be null
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
