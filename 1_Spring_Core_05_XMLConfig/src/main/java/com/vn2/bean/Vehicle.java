package com.vn2.bean;

public class Vehicle {

	private String name;

	public Vehicle() {
		super();
		System.out.println("Vehicle Instatited");
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
