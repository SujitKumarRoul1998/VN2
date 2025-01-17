package com.vn2.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_table")
public class User {

	@Id
	private Integer id;
	
	private String name;
	
    @OneToOne(cascade = CascadeType.ALL)  //Cascade Relationship (Non-Select Operation)
	@JoinColumn(name="profile_id")  //Define the Foreign key Column
	private Profile profile;

	public User() {
		super();
	}

	public User(Integer id, String name, Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", profile=" + profile + "]";
	}
	   
}
