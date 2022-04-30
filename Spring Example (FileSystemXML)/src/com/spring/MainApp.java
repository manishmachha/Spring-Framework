package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext
				("G:/Spring/Spring Example (FileSystemXML)/src/Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		obj.getMessage();
	}
}
