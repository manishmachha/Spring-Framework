package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.setMessage("Hello World !");
		System.out.println(obj.getMessage());
	}
}
