package com.trainersacademy.authenticationservice.service;

import com.trainersacademy.authenticationservice.domain.User;
import com.trainersacademy.authenticationservice.exception.InvalidCredentialsException;

public interface UserService {
	
	public User saveUser(User user);
	
	public User findByUsernameAndPassword(String username, String password) throws InvalidCredentialsException;

}
