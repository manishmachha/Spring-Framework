package com.spring.SpringBean_configurations;

import org.springframework.stereotype.Component;

@Component
public class IMX586 implements Camera {
	public void camdetails() {
		System.out.println("48MP");
	}
}
