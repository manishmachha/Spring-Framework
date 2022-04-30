package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection collection = (JavaCollection) context.getBean("javacollection");
		collection.getAddressList();
		collection.getAddressMap();
		collection.getAddressProp();
		collection.getAddressSet();
	}
}
