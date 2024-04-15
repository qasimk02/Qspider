package com.shoplify.service.electronicsService;

import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class HomeApplianceService extends ElectronicsService{

	
	public void homeAppliancesProducts() {
		System.out.println("Enter 1 for Waching Machine");
		System.out.println("Enter 2 for Firdge");
		System.out.println("Enter 3 for Air Conditioner(AC)");
		System.out.println("Enter 4 to go back");
		InputHandler sc = new InputHandler();
		
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			wachingMachine();
			break;
		case 2: 
			fridge();
			break;
		case 3: 
			ac();
			break;
		case 4:
			electronicsCategory();
			break;
		default:
			System.err.println("Invalid Input");
			homeAppliancesProducts();
		}
	}
	
	public void wachingMachine() {
		homeAppliancesProductPage(AppConstants.wachingMachineCategory);
	}
	
	public void fridge() {
		homeAppliancesProductPage(AppConstants.fridgeCategory);
	}
	
	public void ac() {
		homeAppliancesProductPage(AppConstants.acCategory);
	}
}
