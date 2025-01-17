package com.vn2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profile_Table")
public class Profile {

	@Id
	@Column(name = "profile_id")
	private Integer id;
	
	@Column(name ="address")
	private String address;

	public Profile() {
		super();
	}

	public Profile(Integer id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", address=" + address + "]";
	}
}
