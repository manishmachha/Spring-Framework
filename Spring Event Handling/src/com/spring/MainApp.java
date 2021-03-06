package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		System.out.println(obj.getMessage());
		context.stop();
	}
}
