package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
		obj1.getMessage1();
		obj1.getMessage2();
		HelloIndia obj2 = (HelloIndia) context.getBean("helloindia");
		obj2.getMessage1();
		obj2.getMessage2();
		obj2.getMessage3();
	}
}
