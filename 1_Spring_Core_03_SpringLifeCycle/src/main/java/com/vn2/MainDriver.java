package com.vn2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.config.ProjectConfig;
import com.vn2.entity.Vehicle;

public class MainDriver {

	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle bean = context.getBean(Vehicle.class);
		bean.setName("Tata");
		System.out.println(bean.getName());
		//To Call @Predestroy Method :
	    context.registerShutdownHook();
	
	}
}
