package com.spring;

public class HelloWorld {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	void init() {
		System.out.println("HelloWorld Bean initialized");
	}
	
	void destroy() {
		System.out.println("HelloWorld Bean destroyed");
	}
}
