package com.shoplify.service.fashion;


import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class KidsService extends FashionService{
	
	public void kidsSection() {
		System.out.println("Enter 1 for Top Wear");
		System.out.println("Enter 2 for Bottom Wear");
		System.out.println("Enter 3 for Baby care");
		System.out.println("Enter 4 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			topWear();
			break;
		case 2:
			bottomWear();
			break;
		case 3: 
			babyCare();
			break;
		case 4:
			fashionCategory();
			break;
		default:
			System.err.println("Invalid Input");
			kidsSection();
		}
	}
	
	public void topWear() {
		System.out.println("Enter 1 for Shirt");
		System.out.println("Enter 2 for T-shirt");
		System.out.println("Enter 3 for Sweat Shirt");
		System.out.println("Enter 4 for Coat");
		System.out.println("Enter 5 for Hoodie");
		System.out.println("Enter 6 to go back");
		
		InputHandler sc = new InputHandler();
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			shirts(AppConstants.topWearStyle);
			break;
		case 2:
			tshirts(AppConstants.topWearStyle);
			break;
		case 3:
			sweatShirts(AppConstants.topWearStyle);
			break;
		case 4:
			coats(AppConstants.topWearStyle);
			break;
		case 5:
			hoodies(AppConstants.topWearStyle);
			break;
		case 6:
			kidsSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			topWear();
			break;
		}
	}
	
	public void bottomWear() {
		System.out.println("Enter 1 for Jeans");
		System.out.println("Enter 2 for Pants");
		System.out.println("Enter 3 for Chinos");
		System.out.println("Enter 4 for Shorts");
		System.out.println("Enter 5 to go back");
		
		InputHandler sc = new InputHandler();
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			jeans(AppConstants.bottomWearStyle);
			break;
		case 2:
			pants(AppConstants.bottomWearStyle);
			break;
		case 3:
			chinos(AppConstants.bottomWearStyle);
			break;
		case 4:
			shorts(AppConstants.bottomWearStyle);
			break;
		case 5:
			kidsSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			bottomWear();
			break;
		}
		
	}
	
	public void babyCare() {

		System.out.println("Enter 1 for Diaper");
		System.out.println("Enter 2 for Blanket");
		System.out.println("Enter 3 to go back");
		
		InputHandler sc = new InputHandler();
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			diapers(AppConstants.babyCare);
			break;
		case 2:
			blankets(AppConstants.babyCare);
			break;
		case 3:
			kidsSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			babyCare();
			break;
		}
		
		
	}

	
	
	public void goBack(String style) {
		if(style.equals(AppConstants.topWearStyle)) {
			topWear();
		}else if(style.equals(AppConstants.bottomWearStyle)) {
			bottomWear();
		}else if(style.equals(AppConstants.babyCare)) {
			babyCare();
		}
	}
	
	public void shirts(String style) {
		productPage(AppConstants.kidsSection,style,AppConstants.shirtCategory);
	}
	public void tshirts(String style) {
		productPage(AppConstants.kidsSection,style,AppConstants.tshirtCategory);
	}
	public void sweatShirts(String style) {
		productPage(AppConstants.kidsSection,style,AppConstants.sweatShirtCategory);
	}
	public void coats(String style) {
		productPage(AppConstants.kidsSection,style,AppConstants.coatsCategory);
	}
	public void hoodies(String style) {
		productPage(AppConstants.kidsSection,style,AppConstants.hoodiesCategory);
	}
	
	public void jeans(String style){
		productPage(AppConstants.kidsSection,style,AppConstants.jeansCategory);
	}
	public void pants(String style){
		productPage(AppConstants.kidsSection,style,AppConstants.pantCategory);
	}
	public void chinos(String style){
		productPage(AppConstants.kidsSection,style,AppConstants.chinosCategory);
	}
	public void shorts(String style){
		productPage(AppConstants.kidsSection,style,AppConstants.shortsCategory);
	}
	
	public void diapers(String style){
		productPage(AppConstants.kidsSection,style,AppConstants.diaperCategory);
	}
	public void blankets(String style){
		productPage(AppConstants.kidsSection,style,AppConstants.blanketCategory);
	}
	
}
