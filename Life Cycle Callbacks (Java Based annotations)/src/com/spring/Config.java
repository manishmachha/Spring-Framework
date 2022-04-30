package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
