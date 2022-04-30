package com.spring.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	// advice 
	@Before("execution(void show())") //point-cut
	void logA() {
		System.out.println("Before \'Show()\' called");
		System.out.println();
	}
	
	// advice
	@After("execution(void show())") //point-cut
	void logB() {
		System.out.println();
		System.out.println("After \'Show()\' called");
	}
}
