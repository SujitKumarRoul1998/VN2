package com.vn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn2.entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Integer> {

}
