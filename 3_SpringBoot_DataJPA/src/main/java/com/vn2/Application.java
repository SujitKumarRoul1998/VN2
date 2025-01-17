package com.vn2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vn2.entity.Product;
import com.vn2.repository.ProductRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		/*1.*****************Save*******************/
		//1. Method
//		Product p=new Product();
//		p.setName("KeyBoard");
//		p.setCost(1000.00);
//		p.setColor("Black");
//		
//		Product product = repo.save(p);
//		System.out.println(p);
		
		repo.save(new Product(2,"Pen",5.00,"Blue"));
		repo.save(new Product(3,"Pencile",5.00,"Black"));
		repo.save(new Product(4,"Laptop",50000.00,"Gray"));
		
		/*2.*****************Find*******************/
		//2.1 method.
		
		Optional<Product> id = repo.findById(3);
		if(id.isPresent()) {
			System.out.println(id.get());
		}else {
			System.out.println("No Data Found");
		}
		
		//2.2 Method.
		
		repo.findAll().forEach(System.out::println);
		
		/*3. *****************Delete****************/
		//3.1 Delete by specific Id
		
		repo.deleteById(3);
		
		//3.2 Delete all Rows one by one in (Sequence order) 
		    //Multiple Query fired No of record = no of Query
		  repo.deleteAll(); 
		  	
		//3.3 Delete all rows in Batch (Single Query fired)
		  repo.deleteAllInBatch();
	}

}
