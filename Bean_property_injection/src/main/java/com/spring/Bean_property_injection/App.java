package com.spring.Bean_property_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Tyre obj=(Tyre)context.getBean("tyre");
        System.out.println(obj);
    }
}
