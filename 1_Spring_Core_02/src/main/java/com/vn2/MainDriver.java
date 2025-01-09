package com.vn2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.config.ProjectConfig;
import com.vn2.entity.Vehicle;

public class MainDriver {

	public static void main(String[] args) {
		
		try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)){
			
			Vehicle veh1 = context.getBean("vehicle1",Vehicle.class);
			Vehicle veh2 = context.getBean("vehicle1",Vehicle.class);
			Vehicle veh3 = context.getBean("vehicle2",Vehicle.class);
			System.out.println(veh1.hashCode());
			System.out.println(veh2.hashCode());
			System.out.println(veh3.hashCode());
			
			System.out.println(veh1.getName());
			System.out.println(veh3.getName());
			
			
		}

	}

}
