package com.vn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn2.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
