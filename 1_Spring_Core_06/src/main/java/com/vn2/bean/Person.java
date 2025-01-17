package com.vn2.bean;

public class Person {

	private String name;
	private Vehicle vehicle;
	
	public Person() {
		super();
	}

	public Person(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}	
}
