package com.vn2.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Sony")
public class Sony implements Speaker{

	@Override
	public void makeSound() {
		System.out.println("Play Music Sony");
		
	}

}
