package com.vn2.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyres{

	@Override
	public void rotate() {
		System.out.println("Use Michelin Tyres");
	}

}
