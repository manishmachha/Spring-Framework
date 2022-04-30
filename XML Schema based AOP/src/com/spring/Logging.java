package com.spring;

import org.springframework.messaging.handler.invocation.reactive.ReturnValueHandlerConfigurer;

public class Logging {
	void beforeAdvice() {
		System.out.println("Going to setup Student profile");
	}

	void afterAdvice() {
		System.out.println("Student profile has been setup");
	}

	void afterReturningAdvice(Object retVal) {
		System.out.println("Returning: " + retVal.toString());
	}

	void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("Exception: " + ex.toString());
	}
}
