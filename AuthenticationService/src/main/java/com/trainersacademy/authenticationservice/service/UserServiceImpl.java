package com.trainersacademy.authenticationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainersacademy.authenticationservice.domain.User;
import com.trainersacademy.authenticationservice.exception.InvalidCredentialsException;
import com.trainersacademy.authenticationservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;


	@Override
	public User findByUsernameAndPassword(String username, String password) throws InvalidCredentialsException {
		
		User user = userRepository.findByUsernameAndPassword(username, password);
		
		if(user==null) {
			throw new InvalidCredentialsException();
		}
		
		return user;
	}


	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}


}
