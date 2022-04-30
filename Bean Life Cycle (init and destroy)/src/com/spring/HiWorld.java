package com.spring;

public class HiWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("HiWorld Bean is going through init");
	}

	public void destroy() {
		System.out.println("HiWorld Bean will destroy now");
	}
}
