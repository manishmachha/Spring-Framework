package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Aconfig {

	@Bean
	public A a() {
		return new A();
	}	
}
