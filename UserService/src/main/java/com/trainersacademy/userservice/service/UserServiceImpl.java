package com.trainersacademy.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainersacademy.userservice.domain.User;
import com.trainersacademy.userservice.exception.UserNotFoundException;
import com.trainersacademy.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) throws UserNotFoundException {
		
		if(!userRepository.existsById(user.getUserId())) {
			throw new UserNotFoundException();
		}
		
		return userRepository.save(user);
		
	}

	@Override
	public List<User> listAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUserByUsername(String username) throws UserNotFoundException {
		
		User user = userRepository.findByUsername(username);
		User updatedUser = null;
		if(user == null) {
			throw new UserNotFoundException();
		}
		
			
		updatedUser = userRepository.save(user);
		
		return updatedUser;
		
	}

	@Override
	public boolean deactivateUser(String username) throws UserNotFoundException{
		
		User user = userRepository.findByUsername(username);
		User updatedUser = null;
		if(user == null) {
			throw new UserNotFoundException();
		}
		{
			user.setActive(false);
			updatedUser = userRepository.save(user);
		}
		
		if(updatedUser == null) {
			return false;
		}
		else {
			return true;
		}
	}

}
