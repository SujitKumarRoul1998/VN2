package com.vn2.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Boss implements Speaker{

	@Override
	public void makeSound() {
		System.out.println("Use Boss Speaker");
	}

}
