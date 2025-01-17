package com.vn2.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sony")
@Primary
public class Sony implements Speaker{

	@Override
	public void makeSound() {
	
		System.out.println("Use Sony Speaker");
	}

}
