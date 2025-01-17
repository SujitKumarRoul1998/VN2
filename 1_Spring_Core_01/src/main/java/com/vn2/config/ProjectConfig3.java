package com.vn2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vn2.bean.Vehicle;

@Configuration
public class ProjectConfig3 {

	@Bean("vehicle1")
	Vehicle vehicle1() {
		Vehicle veh=new Vehicle();
		veh.setName("TATA");
		return veh;
	}
	
	@Bean(name ="vehicle2")
	Vehicle vehicle2() {
		Vehicle veh=new Vehicle();
		veh.setName("JEEP");
		return veh;
	}
	
	@Bean(name ="vehicle3")
	Vehicle vehicle3() {
		Vehicle veh=new Vehicle();
		veh.setName("HONDA");
		return veh;
	}
}
