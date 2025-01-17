package com.vn2.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bridgestone")
public class BridgeStone implements Tyres{

	@Override
	public void rotate() {
		System.out.println("Use BridgeStone Tyres");
	}

}
