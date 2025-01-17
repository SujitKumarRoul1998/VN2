package com.vn2.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn2.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	//select * from product where prod_code=prodCode;
	Product findByProdCode(String prodCode);
	
	//select * from product where prod_code is null
	List<Product> findByProdCodeIsNull();
	
	//select * from product where prod_cost=cost
	List<Product> findByProdCostGreaterThan(Double cost);

	//select * from product where prod_cost in (cost)
	List<Product> findByProdCostIn(Collection<Double> costs);

	//select * from product where pid=? Or pcost=?
	List<Product> findByProdIdOrProdCost(Integer pid, Double cost);

	//select * from product where pid between pid1 and pid2
	List<Product> findByProdIdBetween (Integer pid1, Integer pid2);
}
