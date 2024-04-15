package com.shoplify.service.electronicsService;

import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class MobileAndLaptopService extends ElectronicsService{
	
	public void mobileAndLaptopProducts() {
		System.out.println("Enter 1 for Mobile");
		System.out.println("Enter 2 for Laptops");
		System.out.println("Enter 3 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		
		switch (n) {
		case 1:			
			mobiles();
			break;
		case 2: 
			laptops();
			break;
		case 3:
			electronicsCategory();
			break;
		default:
			System.err.println("Invalid Input");
			mobileAndLaptopProducts();
		}
	}
	
	public void mobiles() {
		mobileAndLaptopsProductPage(AppConstants.mobileCategory);
	}
	
	public void laptops() {
		mobileAndLaptopsProductPage(AppConstants.laptopCategory);
	}
}
