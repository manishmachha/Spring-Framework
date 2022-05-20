package com.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
		obj1.getMessage();
		context.registerShutdownHook();		
	}
}
