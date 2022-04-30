package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student obj = (Student) context.getBean("student");
		obj.setName("Manish");
		obj.setAge(23);
		obj.getName();
		obj.getAge();
		obj.printException();
	}
}
