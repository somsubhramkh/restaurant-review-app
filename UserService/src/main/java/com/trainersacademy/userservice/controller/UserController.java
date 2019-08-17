package com.trainersacademy.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainersacademy.userservice.domain.User;
import com.trainersacademy.userservice.service.UserService;

@RestController
@RequestMapping("/api/v1/userservice")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ResponseEntity listAllUsers() {
		
		return new ResponseEntity(userService.listAllUsers(), HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity registerUser(@RequestBody User user) {
		
		User newUser = userService.registerUser(user);
		
		return new ResponseEntity(newUser, HttpStatus.CREATED);
	}

	

}
