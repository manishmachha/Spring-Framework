package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj=(Vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
