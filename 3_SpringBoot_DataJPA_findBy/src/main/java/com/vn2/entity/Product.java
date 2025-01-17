package com.vn2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_Table")
public class Product {
	
	@Id
	@Column(name = "prod_id")
	private Integer prodId;
	
	@Column(name = "prod_code")
	private String prodCode;
	
	@Column(name = "prod_name")
	private String prodName;
	
	@Column(name = "prod_cost")
	private Double prodCost;

	public Product() {
		super();
	}

	public Product(Integer prodId, String prodCode, String prodName, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodName=" + prodName + ", prodCost="
				+ prodCost + "]";
	}

	}	

