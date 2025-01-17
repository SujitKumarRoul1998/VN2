package com.vn2;

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
	
		repo.save(new Product(1,"P1001", "Yoga Mat", 25.50));
        repo.save(new Product(2,"P1002", "Dumbbell Set", 50.00));
       	repo.save(new Product(3,"P1003", "Treadmill", 999.99));
        repo.save(new Product(4,"P1004", "Resistance Band", 15.00));
       repo.save(new Product(5,"P1005", "Exercise Ball", 30.00));


		
		repo.findByProdIdOrProdCost(2,22.5).forEach(System.out::println);
	}

}
