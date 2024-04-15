package com.shoplify.service;

import java.util.List;

import com.shoplify.model.User;
import com.shoplify.repository.UserRepository;
import com.shoplify.util.AppConstants;

public class UserService {	
	UserRepository userRepository = new UserRepository();
	
	
	public static void init() {
		UserRepository.init();
	}
	//create user
	public User createUser(String name,String email,String password,String phoneNumber,String address) {
		User user = userRepository.addUser(new User(name,email,password,phoneNumber,true,address,AppConstants.normalUser));
		return user;
	}

	//delete user
	public void deleteUser(User user) {
		if(userRepository.deleteUser(user)) {
			System.out.println("User Deleted Successfully...");
		}else {
			System.err.println("User Not found!");
		}
	}
	
	//find user
	public User getUser(int id) {
		return userRepository.findById(id);
	}
	
	public List<User> getAllUsers(){
		return userRepository.getAllUsers();
	}
	public User getUser(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User getUser(String email,String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
	
	
	//update user
}
