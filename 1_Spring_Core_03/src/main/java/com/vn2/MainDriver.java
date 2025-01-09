package com.vn2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.config.ProjectConfig;
import com.vn2.entity.Vehicle;

public class MainDriver {

	public static void main(String[] args) {
		
		var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle veh= context.getBean("vehicle3",Vehicle.class);
		System.out.println("Vehicle name from Spring Context is : "+ veh.getName());

	}

}
