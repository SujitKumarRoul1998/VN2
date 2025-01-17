package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vn2.bean.Vehicle;

@Configuration
public class ProjectConfig2 {

	@Bean
	Vehicle vehicle1() {
		
		Vehicle veh=new Vehicle();
		veh.setName("Audi");
		return veh;
	}
	@Bean
	Vehicle vehicle2() {
		Vehicle veh=new Vehicle();
		veh.setName("Honda");
		return veh;
	}
	@Bean
	Vehicle vehicle3() {
		Vehicle veh=new Vehicle();
		veh.setName("TATA");
		return veh;
	}
}
