package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vn2.bean.Vehicle;

@Configuration
@ComponentScan(basePackages = "com.vn2")
public class ProjectConfig {
	@Bean("vehicle1")
	@Primary
	public Vehicle vehicle1() {
		Vehicle veh=new Vehicle();
		veh.setName("TATA");
		return veh;
	}
	
	@Bean(name = "vehicle2")
	public Vehicle vehicle2() {
		
		Vehicle veh=new Vehicle();
		veh.setName("JEEP");
		return veh;
	}

}
