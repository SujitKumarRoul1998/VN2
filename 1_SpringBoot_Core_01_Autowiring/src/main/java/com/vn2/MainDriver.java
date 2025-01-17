package com.vn2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.bean.Person;
import com.vn2.bean.Vehicle;
import com.vn2.config.ProjectConfig;

public class MainDriver {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	
		Vehicle vehicle=new Vehicle();
		vehicle.setName("AUDI");
		
		Person person = context.getBean(Person.class);
		person.setVehicle(vehicle);
		System.out.println(person);
	}
}
