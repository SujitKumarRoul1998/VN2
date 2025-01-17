package com.vn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn2.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
