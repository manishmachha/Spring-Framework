package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.setMessage("Hello World");
		System.out.println(obj.getMessage());
		context.registerShutdownHook();
	}
}
