package com.shoplify.service.fashion;


import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class WomenService extends FashionService{
	
	public void womenSection() {
		System.out.println("Enter 1 for Casual Wear");
		System.out.println("Enter 2 for Party Wear");
		System.out.println("Enter 3 for Modest Wear");
		System.out.println("Enter 4 for Out Wear");
		System.out.println("Enter 5 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			casualWear();
			break;
		case 2: 
			partyWear();
			break;
		case 3: 
			modestWear();
			break;
		case 4:
			outWear();
			break;
		case 5:
			fashionCategory();
			break;
		default:
			System.err.println("Invalid Input");
			womenSection();
		}
	}
	
	public void casualWear() {
		InputHandler sc = new InputHandler();
		
		System.out.println("Enter 1 for T-Shirts");
		System.out.println("Enter 2 for Jeans");
		System.out.println("Enter 3 for Hoodies");
		System.out.println("Enter 4 for Shoes");
		System.out.println("Enter 5 to go back");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			tshirts(AppConstants.casualStyle);
			break;
		case 2:
			jeans(AppConstants.casualStyle);
			break;
		case 3:
			hoodies(AppConstants.casualStyle);
			break;
		case 4:
			shoes(AppConstants.shoesCategory);
		case 5:
			womenSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			casualWear();
		}
	}
	
	public void partyWear() {
		System.out.println("Enter 1 for Gown");
		System.out.println("Enter 2 for JumpSuit");
		System.out.println("Enter 3 for CockTail");
		
		InputHandler sc = new InputHandler();

		int option = sc.nextInt();
		switch(option) {
		case 1:
			gowns(AppConstants.partyWearStyle);
			break;
		case 2:
			jumpSuits(AppConstants.partyWearStyle);
			break;
		case 3:
			cockTail(AppConstants.partyWearStyle);
			break;
		default:
			System.err.println("Please Enter correct choice");
			partyWear();
		}
		
		
	}
	
	public void modestWear() {
		InputHandler sc = new InputHandler();
		
		System.out.println("Enter 1 for Hijab");
		System.out.println("Enter 2 for Abaya");
		System.out.println("Enter 3 for Maxi Dressess");
		System.out.println("Enter 4 to go back");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			hijab(AppConstants.modestWearStyle);
			break;
		case 2:
			abaya(AppConstants.modestWearStyle);
			break;
		case 3:
			maxi(AppConstants.modestWearStyle);
			break;
		case 4:
			womenSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			modestWear();
		}
	}
	
	public void outWear() {
		InputHandler sc = new InputHandler();
		
		System.out.println("Enter 1 for Jacket");
		System.out.println("Enter 2 for Coat");
		System.out.println("Enter 3 to go back");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			jackets(AppConstants.outWearStyle);
			break;
		case 2:
			coats(AppConstants.outWearStyle);
			break;
		case 3:
			womenSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			outWear();
			break;
		}
	}
	
	public void goBack(String style) {
		if(style.equals(AppConstants.casualStyle)) {
			casualWear();
		}else if(style.equals(AppConstants.partyWearStyle)) {
			partyWear();
		}else if(style.equals(AppConstants.modestWearStyle)) {
			modestWear();
		}else if(style.equals(AppConstants.outWearStyle)) {
			outWear();
		}
	}
	
	public void tshirts(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.tshirtCategory);
	}
	
	public void shirts(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.shirtCategory);
	}
	
	public void jeans(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.jeansCategory);
	}
	
	public void hoodies(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.hoodiesCategory);
	}
	
	public void shoes(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.shoesCategory);
	}
	
	public void gowns(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.gownsCategory);
	}
	
	public void jumpSuits(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.jumpSuitsCategory);
	}

	public void cockTail(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.cockTailCategory);
	}
	
	public void hijab(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.hijabCategory);
	}
	
	public void abaya(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.abayaCategory);
	}
	
	public void maxi(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.maxiCategory);
	}
	
	public void jackets(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.jacketCategory);
	}

	public void coats(String style) {
		productPage(AppConstants.womensSection,style,AppConstants.coatsCategory);
	}
	
	
}