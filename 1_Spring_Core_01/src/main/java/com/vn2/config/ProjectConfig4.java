package com.vn2.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vn2.bean.Vehicle;

@Configuration
public class ProjectConfig4 {
	
	/*
	 * @Primary Annotation used to make a Bean as Default Bean. 
	 * Otherwise we will get NoUniqueBeanDefinitionException .
	 */
	
	@Bean
	@Primary
	Vehicle vehicle1() {
		Vehicle veh=new Vehicle();
		veh.setName("TATA");
		return veh;
	}
	
	@Bean
//	@Primary
	Vehicle vehicle2() {
		Vehicle veh=new Vehicle();
		veh.setName("JEEP");
		return veh;
	}
	
	@Bean
	Vehicle vehicle3() {
		Vehicle veh=new Vehicle();
		veh.setName("HONDA");
		return veh;
	}
}
