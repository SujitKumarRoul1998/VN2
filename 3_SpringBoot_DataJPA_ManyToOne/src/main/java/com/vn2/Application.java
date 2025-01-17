package com.vn2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vn2.entity.Department;
import com.vn2.entity.Employee;
import com.vn2.repository.DepartmentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private DepartmentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Department sales=new Department();
		//sales.setId(1);
		sales.setName("Sales");
		
		Employee e1=new Employee();
		//e1.setId(1);
		e1.setName("Sujit");
		
		Employee e2=new Employee();
	//	e2.setId(2);
		e2.setName("Kumar");
		
		sales.setEmployee(Arrays.asList(e1,e2));
		
		
		repo.save(sales);
		
	}

}
