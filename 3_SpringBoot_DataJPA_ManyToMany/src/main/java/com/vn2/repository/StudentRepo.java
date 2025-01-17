package com.vn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn2.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
