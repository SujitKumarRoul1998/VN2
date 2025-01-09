package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vn2.beans.Vehicle;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean Definition Methods. 
So Spring container can process the class and generate Spring Beans to be used in the application.
* */

@Configuration
public class ProjectConfig {
	
	
	 /*
    @Bean annotation, 
    which lets Spring know that, It needs to call this method ,
    when it initializes its context and adds the returned value to the context.
    * */
	@Bean
	Vehicle vehicle() {
		Vehicle veh=new Vehicle();
		veh.setName("JEEP");
		return veh;
	}
	
	@Bean
	String hello() {
		
		return "I Love Not You";
	}
	
	@Bean
	Integer number() {
		
		return 0;
	}
}
