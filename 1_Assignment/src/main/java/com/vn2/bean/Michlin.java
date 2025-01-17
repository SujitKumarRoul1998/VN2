package com.vn2.bean;

import org.springframework.stereotype.Component;

@Component
public class Michlin implements Tyres {

	@Override
	public void rotate() {
		System.out.println("Michlin Tyres Foreword...!!");
		
	}

}
