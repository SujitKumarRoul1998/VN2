package com.vn2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private Vehicle vehicle;

	public Person() {
		super();
	}

	@Autowired
	public Person(@Qualifier ("vehicle2") Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Person [vehicle=" + vehicle + "]";
	}	
}
