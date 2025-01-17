package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vn2.bean.Vehicle;

@Configuration
public class ProjectConfig1 {

	@Bean
	Vehicle vehicle() {
		
		Vehicle veh=new Vehicle();
		veh.setName("TATA");
		return veh;
	}
	
	@Bean
	Integer number() {
		return 10;
	}
	
	@Bean
	String hello() {
		return "Welcome To Odisha";
	}
}
