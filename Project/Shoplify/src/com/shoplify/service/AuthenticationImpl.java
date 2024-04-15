package com.shoplify.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shoplify.model.User;
import com.shoplify.util.InputHandler;


public class AuthenticationImpl implements Authentication{
	
	private String emailValidation(InputHandler sc) {
		System.out.print("Enter your valid email: ");
		String email = sc.nextLine();
		
		String regex = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher object
        Matcher matcher = pattern.matcher(email);
        
        if(matcher.matches()) {
        	return email;
        }else {
        	System.err.println("Invalid Email!");
        	email = emailValidation(sc);
        }
        
        return email;
	}
	
	private String mobileNumberValidation(InputHandler sc) {
		System.out.print("Enter your 10 digit mobile Number: ");
		String mNumber = sc.nextLine();
		if(mNumber.length()==10 && mNumber.charAt(0)!='0') {
			return mNumber;
		}else {
			System.err.println("Enter correct Mobile number");
			mNumber = mobileNumberValidation(sc);
		}
		return mNumber;
	}
	
	private String passwordValidation(InputHandler sc) {
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		String regex = "^(?=[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher object
        Matcher matcher = pattern.matcher(password);
        
        if(matcher.matches()) {
        	return password;
        }else {
        	System.err.println("1) Password length should be atleast 8");
        	System.err.println("2) Password should contain a mix of lowercase letters, numbers, and special characters");
        	System.err.println("3) Password should starts with Uppercase letter");
        	password = passwordValidation(sc);
        }
        return password;
	}
	
	public User register() {
		InputHandler sc = new InputHandler();
		System.out.print("Enter Your Full Name: ");
		String name = sc.nextLine();
		String email = emailValidation(sc);
		String pass = passwordValidation(sc);
		String mobileNo = mobileNumberValidation(sc);
		System.out.print("Enter your address: ");
		String address = sc.nextLine();
		UserService userService = new UserService();
		User newUser = userService.createUser(name,email.trim(),pass.trim(),mobileNo,address);
		CartService cartService = new CartService();
		cartService.createCart(newUser);
		return newUser;
	}
	
	public void opitonIfUserNotFount() {
		System.out.println("Enter 1 for Register");
		System.out.println("Enter 2 for Login");
		InputHandler sc = new InputHandler();
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			register();
		case 2:
			login();
			break;
		default:
			System.err.println("Choose correct option");
			opitonIfUserNotFount();
			break;
		}
	}
	
	public void login() {
		InputHandler sc = new InputHandler();
		
		System.out.print("Enter your contact Email: ");
		String credential = sc.nextLine();
		System.out.print("Enter your password: ");
		String pass = sc.nextLine();
		
		UserService userService = new UserService();
		User user = userService.getUser(credential.trim(), pass.trim());
		
		if(user==null) {
			System.err.println("USER NOT FOUND! Wrong Credentials");
			opitonIfUserNotFount();
		}else {
			Session.setUser(user);
		}
	}
	
}