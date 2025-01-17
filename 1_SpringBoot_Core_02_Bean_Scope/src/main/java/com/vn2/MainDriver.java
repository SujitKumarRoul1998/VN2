package com.vn2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.bean.Vehicle;
import com.vn2.config.ProjectConfig;

public class MainDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle bean1 = context.getBean(Vehicle.class);
	    System.out.println(bean1.hashCode());
	    bean1.setName("JEEP");
	    System.out.println(bean1.getName());
	    
	    Vehicle bean2 = context.getBean(Vehicle.class);
	    System.out.println(bean2.hashCode());
	    bean2.setName("TATA");
	    System.out.println(bean2.getName());
	}
}
