package com.shoplify.service.electronicsService;

import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class WearableService extends ElectronicsService{
	
	public void wearableProducts() {
		
		System.out.println("Enter 1 for Watches");
		System.out.println("Enter 2 for EarPhone");
		System.out.println("Enter 3 for HeadPhone");
		System.out.println("Enter 4 for EarBuds");
		System.out.println("Enter 5 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		
		switch (n) {
		case 1:			
			watches();
			break;
		case 2: 
			earPhones();
			break;
		case 3: 
			headPhones();
			break;
		case 4:
			earPhones();
			break;
		case 5:
			electronicsCategory();
			break;
		default:
			System.err.println("Invalid Input");
			wearableProducts();
		}
	}
	
	public void watches() {
		wearableProductPage(AppConstants.watchCategory);
	}
	
	public void earPhones() {
		wearableProductPage(AppConstants.earPhoneCategory);
	}
	
	public  void headPhones() {
		wearableProductPage(AppConstants.headPhoneCategory);
	}
	
	public void earBuds() {
		wearableProductPage(AppConstants.earBudsCategory);
	}
	
}
