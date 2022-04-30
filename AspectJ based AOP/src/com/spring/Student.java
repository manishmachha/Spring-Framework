package com.spring;

public class Student {
	String name;
	int age;
	public String getName() {
		System.out.println("Name: " + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("Age: " + age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printException() {
		System.out.println("Exception Raised");
		throw new IllegalArgumentException();
	}
}
