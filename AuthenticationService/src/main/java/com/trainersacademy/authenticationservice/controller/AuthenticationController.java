package com.trainersacademy.authenticationservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainersacademy.authenticationservice.domain.User;
import com.trainersacademy.authenticationservice.exception.InvalidCredentialsException;
import com.trainersacademy.authenticationservice.service.UserService;

@RestController
@RequestMapping("/api/v1/authservice")
public class AuthenticationController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseEntity loginUser(@RequestBody User user) throws InvalidCredentialsException {
		
		User userObj = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity saveUser(@RequestBody User user) {
		userService.saveUser(user);
		
		return new ResponseEntity(HttpStatus.CREATED);
	}



}
