package com.trainersacademy.userservice.service;

import java.util.List;

import com.trainersacademy.userservice.domain.User;
import com.trainersacademy.userservice.exception.UserNotFoundException;

public interface UserService {
	
	public User registerUser(User user);
	
	public User updateUser(User user) throws UserNotFoundException;
	
	public List<User> listAllUsers();
	
	public User getUserByUsername(String username) throws UserNotFoundException;
	
	public boolean deactivateUser(String username) throws UserNotFoundException;

}
