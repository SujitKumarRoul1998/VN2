package com.vn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vn2.entity.Profile;
import com.vn2.entity.User;
import com.vn2.repository.UserRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Profile p1=new Profile(1,"Bangalore");
		User u1=new User(1,"Sujit",p1);
		repo.save(u1);
		
		Profile p2=new Profile(2,"Kailash");
		User u2=new User(2,"Shivji",p2);
		repo.save(u2);
	}

}
