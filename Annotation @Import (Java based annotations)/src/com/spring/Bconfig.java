package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Aconfig.class)
public class Bconfig {
	
	@Bean
	public B b() {
		return new B();
	}
}
