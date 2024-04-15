package com.shoplify.model;

import java.time.LocalDateTime;

public class User {
	String name;
	String email;
	private String password;
	String phoneNumber;
	boolean isActive;
	String address;
	String role;
	LocalDateTime createdAt;
	
	public User(String name,String email, String password, String phoneNumber, boolean isActive, String address, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
		this.address = address;
		this.createdAt = LocalDateTime.now();
		this.role = role;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", isActive=" + isActive + ", address=" + address + ", role=" + role + ", createdAt=" + createdAt
				+ "]";
	}
	
	
}
