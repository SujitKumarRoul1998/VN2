package com.vn2;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From CMD Runner");
		System.out.println("--------Hello CommandLineRunner----------");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		System.out.println(Arrays.asList(args));
		System.out.println("------------End Of CommandLineRunner---------");
		
	}

}
