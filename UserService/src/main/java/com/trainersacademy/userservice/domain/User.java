package com.trainersacademy.userservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String username;
	private String name;
	private String email;
	private String password;
	private boolean isActive;
	
	public User() {
		
	}

	public User(int userId, String username, String name, String email, String password, boolean isActive) {
		this.userId = userId;
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", isActive=" + isActive + "]";
	}

	
	
	
	
	
}
