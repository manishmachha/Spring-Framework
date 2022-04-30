package com.spring.SpringBean_configurations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SD_870 implements Cpu {

	public void cpudetails() {
	System.out.println("Snapdragon 870 - Octacore");
	}

}
