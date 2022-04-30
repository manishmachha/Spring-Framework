package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		A objA = (A) context.getBean("aref");
		System.out.println(objA.getX());
		System.out.println(objA.obj.getY());
		System.out.println(objA);
	}
}
