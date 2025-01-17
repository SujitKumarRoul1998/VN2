package com.vn2;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello Application Runner");
		System.out.println(Arrays.asList(args.getSourceArgs()));
		System.out.println(args.getSourceArgs());
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());
		System.out.println(args.getOptionValues(null));
		System.out.println("End Of Application Runner");
		
	}

}
