package com.vn2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vn2.bean.Vehicle;

public class MainDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Vehicle vehicle=context.getBean(Vehicle.class);
		System.out.println(vehicle.getName());
	}
}
