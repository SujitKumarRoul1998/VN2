package com.vn2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	private String name="TATA";
	
	private VehicleService vehicleService;
	
	public Vehicle() {
		super();
	}

	@Autowired
	public Vehicle(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", vehicleService=" + vehicleService + "]";
	}
}
