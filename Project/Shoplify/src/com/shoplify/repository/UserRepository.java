package com.shoplify.repository;

import java.util.ArrayList;
import java.util.List;

import com.shoplify.model.User;
import com.shoplify.util.AppConstants;

public class UserRepository {
	private static List<User> users = new ArrayList<>();
	
	public static void init() {
		users.add(new User("ADMIN","admin@gmail.com","admin@123k","9695339121",true,"Kurla Mumbai",AppConstants.adminUser));
	}
	
	public User addUser(User user) {
		users.add(user);
		return user;
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User findById(int id) {
		User user = null;
		try {
			user = users.get(id);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("User not found!");
		}
		return user;
	}
	
	public User findByEmail(String email) {
		User user = null;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getEmail().equals(email)) {
				return users.get(i);
			}
		}
		return user;
	}
	
	public User findByEmailAndPassword(String email,String password) {
		User user = null;
		for(int i=0;i<users.size();i++) {
			User temp = users.get(i);
			if(temp.getEmail().equals(email) && temp.getPassword().equals(password)) {
				return temp;
			}
		}
		return user;
	}
	
	//could've done better
	public User updateUser(User user,int id) {	
		for(int i=0;i<users.size();i++) {
			if(i==id) {
				users.add(i, user);
			}
		}
		return user;
	}
	
	public boolean deleteUser(User user) {
		boolean isDeleted = false;
		if(users.contains(user)) {
			users.remove(user);
			isDeleted = true;
		}
		return isDeleted;
	}
}