package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
		obj1.setMessage("I am object 1");
		obj1.getMessage();
		HelloWorld obj2 = (HelloWorld) context.getBean("helloworld");
		obj2.getMessage();
	}
}
