package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vn2.entity.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean(name="vehicle1")
	Vehicle vehicle1() {
		
		var veh=new Vehicle();
		veh.setName("Audi");
		return veh;
	}
	
	@Bean(value="vehicle2")
	Vehicle vehicle2() {
		
		var veh=new Vehicle();
		veh.setName("Jeep");
		return veh;
	}
	
	@Bean("vehicle3")
	Vehicle vehicle3() {
		
		var veh=new Vehicle();
		veh.setName("TATA");
		return veh;
	}	
}
