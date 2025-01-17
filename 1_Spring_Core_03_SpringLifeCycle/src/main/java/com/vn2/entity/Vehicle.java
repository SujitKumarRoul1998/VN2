package com.vn2.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {

	private String name;

	public Vehicle() {
		super();
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

@PostConstruct	
public void initMethod() {
	System.out.println("init Method");
	this.name="TATA";
}

@PreDestroy
public void destroyMethod() {
	System.out.println("Object Destroyed");
}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
		
}
