package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Students obj=(Students) context.getBean("students");
		System.out.println("name: " + obj.getName());
		System.out.println("age: " + obj.getAge());
	}
}
