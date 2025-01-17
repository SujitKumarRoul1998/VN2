package com.vn2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vn2.bean.Vehicle;
import com.vn2.config.ProjectConfig4;

public class MainDriver {

	public static void main(String[] args) {
		
		/*
		 * Vehicle vehicle=new Vehicle(); 
		 * vehicle.setName("JEEP");
		 * System.out.println("Vehicle name from non-spring context is : "+vehicle.getName());
		 * 
		 * ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig1.class); 
		 * Vehicle bean = context.getBean(Vehicle.class);
		 * System.out.println("Vehicle name from Spring Context is : "+ bean.getName());
		 */
		
		
		/*
		 * Integer integer = context.getBean(Integer.class);
		 * System.out.println("Integer value from Spring Context is : "+integer);
		 * 
		 * String string=context.getBean(String.class);
		 * System.out.println("String value from Spring Context is : "+string); 
		 */
		
		/*
		 * ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig2.class);
		 * Vehicle bean =context.getBean("vehicle3",Vehicle.class);
		 * System.out.println(bean.getName());
		 */
		
		/*
		 * ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig3.class); 
		 * Vehicle bean =context.getBean("vehicle1",Vehicle.class);
		 * System.out.println(bean.getName());
		 */
		
		/*
		 * ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig4.class);
		 * Vehicle bean=context.getBean(Vehicle.class); 
		 * System.out.println(bean.getName());
		 */
		
		
	}
}
