package com.trainersacademy.authenticationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainersacademy.authenticationservice.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUsernameAndPassword(String username, String password); 

}
