package com.vn2.entity;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	private String name;

	public Vehicle() {
		super();

	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
		
}
