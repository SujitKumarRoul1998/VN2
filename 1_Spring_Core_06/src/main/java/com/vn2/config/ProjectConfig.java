package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vn2.bean.Person;
import com.vn2.bean.Vehicle;

@Configuration
/* @ComponentScan(basePackages = "com.vn2") */
public class ProjectConfig {

	@Bean
	Vehicle vehicle() {
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("TATA");
		return vehicle;
	}
	
	@Bean
	Person person(Vehicle vehicle) {
		
		Person person=new Person();
		person.setName("SUJIT");
		person.setVehicle(vehicle);
		
		return person;
	}
}
