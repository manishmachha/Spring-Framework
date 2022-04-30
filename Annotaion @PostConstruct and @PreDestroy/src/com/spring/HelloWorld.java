package com.spring;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("HelloWorld Bean is initialized");
	}
	
	public void destroy() {
		System.out.println("HelloWorld Bean will destroy now");
	}
}
