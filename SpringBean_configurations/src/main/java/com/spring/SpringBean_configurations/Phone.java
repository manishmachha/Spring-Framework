package com.spring.SpringBean_configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Phone {
	@Autowired
	Camera camera;

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	@Autowired
	@Qualifier("SD_888")
	Cpu cpu;

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	void config() {
		System.out.println("RAM : 4GB");
		System.out.print("CPU : ");
		cpu.cpudetails();
		System.out.print("Camera : ");
		camera.camdetails();
	}
}
