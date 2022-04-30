package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void drive() {
		System.out.println("Riding the bike....");
	}
}
