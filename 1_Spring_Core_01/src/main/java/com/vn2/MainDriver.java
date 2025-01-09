package com.vn2;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.beans.Vehicle;
import com.vn2.config.ProjectConfig;

public class MainDriver {

	public static void main(String[] args) {
		

		Vehicle vehicle=new Vehicle();
		vehicle.setName("Audi");
		 System.out.println("Vehicle name from Non-Spring Context is: " + vehicle.getName());
	
		 
		 ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	
		 Vehicle bean = context.getBean(Vehicle.class);
		 System.out.println("Vehicle name from Spring Context is : "+bean.getName());
	
		 
		 /*
	        We don’t need to do any explicit casting ,while fetching a bean from context.
	        Spring is smart enough to look for a bean of the type you requested in its context.
	        If such a bean does n’t exist,Spring will throw an Exception.
	      * */
		 
		 String hello = context.getBean(String.class);
		 System.out.println("Vehicle name from Spring Context is : "+hello);
		 
		 Integer num = context.getBean(Integer.class);
		 System.out.println("Vehicle name from Spring Context is : "+num);
		
		 try {
			 
	      Double exp = context.getBean(Double.class);
	      System.out.println("Vehicle name from Spring Context is : "+exp);
	     
		 }catch(NoSuchBeanDefinitionException e) {
			 
			 System.out.println("Not Such type Bean Found");
		 }
	}

}
