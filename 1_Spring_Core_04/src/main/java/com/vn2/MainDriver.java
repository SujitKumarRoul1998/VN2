package com.vn2;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.vn2.bean.Vehicle;
import com.vn2.config.ProjectConfig;

public class MainDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle veh=new Vehicle();
		veh.setName("TATA");
		
		Supplier<Vehicle> vehSupplier=() ->veh;
		
		Supplier<Vehicle> audiSupplier=()->{
			
			Vehicle audi=new Vehicle();
			audi.setName("AUDI");
			return audi;
		};
		
		Random random=new Random();
		int randomNumber=random.nextInt(10);
		System.out.println("RandomNumber : "+randomNumber);
		
		if((randomNumber%2)==0){
			System.out.println("From veh");
			((GenericApplicationContext) context).registerBean("veh",Vehicle.class,vehSupplier);
			
		}else {
			System.out.println("from Audi");
			((GenericApplicationContext) context).registerBean("audi",Vehicle.class,audiSupplier);
		}
		
		//Vehicle bean=context.getBean(Vehicle.class);
		//System.out.println(bean.getName());
		
	}
}
