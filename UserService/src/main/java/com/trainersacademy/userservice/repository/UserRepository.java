package com.trainersacademy.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainersacademy.userservice.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUsername(String username);

}
