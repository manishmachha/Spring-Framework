package com.spring.SpringBean_configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
       Phone ph1=context.getBean(Phone.class);
       ph1.config();
    }
}
