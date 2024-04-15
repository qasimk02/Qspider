package com.shoplify.service;

import com.shoplify.model.User;

public class Session {
	private static User currentLoggedInUser;
	
	public static User getUser() {
		return currentLoggedInUser;
	}
	
	public static void setUser(User user) {
		currentLoggedInUser = user;
	}
}
