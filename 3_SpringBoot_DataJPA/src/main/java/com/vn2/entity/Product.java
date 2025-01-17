package com.vn2.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_Table")
public class Product {
	@Id
	private Integer id;
	
	@Column(name = "prod_name")
	private String name;
	
	@Column(name = "prod_cost")
	private Double cost;
	
	@Column(name = "prod_color")
	private String color;

	public Product() {
		super();
	}

	@Autowired
	public Product(Integer id, String name, Double cost, String color) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", color=" + color + "]";
	}
}
