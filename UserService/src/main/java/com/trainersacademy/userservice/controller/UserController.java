package com.trainersacademy.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainersacademy.userservice.domain.User;
import com.trainersacademy.userservice.exception.UserNotFoundException;
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
	
	@GetMapping("/{username}")
	public ResponseEntity getUser(@PathVariable("username") String username) throws UserNotFoundException {
		
		return new ResponseEntity(userService.getUserByUsername(username), HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity registerUser(@RequestBody User user) {
		
		User newUser = userService.registerUser(user);
		
		return new ResponseEntity(newUser, HttpStatus.CREATED);
	}
	
	@PutMapping("/")
	public ResponseEntity updateUser(@RequestBody User user) throws UserNotFoundException {
		
		User newUser = userService.updateUser(user);
		
		return new ResponseEntity(newUser, HttpStatus.OK);
	}
	

	@PutMapping("/deactivate/{username}")
	public ResponseEntity updateUser(@PathVariable("username") String username) throws UserNotFoundException {
		
		boolean status = userService.deactivateUser(username);
		
		return new ResponseEntity(status, HttpStatus.OK);
	}

}
