package com.shoplify.service.fashion;

import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class MenService extends FashionService{
	
	public void menSection() {
		System.out.println("Enter 1 for Formal Wear");
		System.out.println("Enter 2 for Casual Wear");
		System.out.println("Enter 3 for Acitve Wear");
		System.out.println("Enter 4 for Out Wear");
		System.out.println("Enter 5 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			formalWear();
			break;
		case 2: 
			casualWear();
			break;
		case 3: 
			activeWear();
			break;
		case 4:
			outWear();
			break;
		case 5:
			fashionCategory();
			break;
		default:
			System.err.println("Invalid Input");
			menSection();
		}
	}
	
	public void formalWear() {
		InputHandler sc = new InputHandler();
		
		System.out.println("Enter 1 for Shirts");
		System.out.println("Enter 2 for Pants");
		System.out.println("Enter 3 for Suits");
		System.out.println("Enter 4 to go back");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			shirts(AppConstants.formalStyle);
			break;
		case 2:
			pants(AppConstants.formalStyle);
			break;
		case 3:
			suits(AppConstants.formalStyle);
			break;
		case 4:
			menSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			formalWear();
		}
	}
	
	public void casualWear() {
		InputHandler sc = new InputHandler();
		
		System.out.println("Enter 1 for R-shirt");
		System.out.println("Enter 2 for Jeans");
		System.out.println("Enter 3 for Chinos");
		System.out.println("Enter 4 for Sweater");
		System.out.println("Enter 5 for Shoes");
		System.out.println("Enter 6 to go back");
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			tshirts(AppConstants.casualStyle);
			break;
		case 2:
			jeans(AppConstants.casualStyle);
			break;
		case 3:
			chinos(AppConstants.casualStyle);
			break;
        case 4:
            sweaters(AppConstants.casualStyle);
        case 5:
            shoes(AppConstants.casualStyle);
		case 6:
			menSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			casualWear();
		}
	}
	
	public void activeWear() {
		InputHandler sc = new InputHandler();

		System.out.println("Enter 1 for Shorts");
		System.out.println("Enter 2 for Hoodies");
		System.out.println("Enter 3 for Shoes");
		System.out.println("Enter 4 to go back");
		
		int option = sc.nextInt();
		switch(option) {
		case 1:
			shorts(AppConstants.activeWearStyle);
			break;
		case 2:
			hoodies(AppConstants.activeWearStyle);
			break;
		case 3:
			shoes(AppConstants.activeWearStyle);
			break;
		case 4:
			menSection();
			break;
		default:
			System.err.println("Please Enter correct choice");
			activeWear();
		}
	}
	
	public void outWear() {
		InputHandler sc = new InputHandler();

        System.out.println("Enter 1 for Coat");
        System.out.println("Enter 2 for Jackets");
        System.out.println("Enter 3 for Hoodies");
        System.out.println("Enter 4 to go back");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                coats(AppConstants.outWearStyle);
                break;
            case 2:
                jackets(AppConstants.outWearStyle);
                break;
            case 3:
                hoodies(AppConstants.outWearStyle);
                break;
            case 4:
                menSection();
                break;
            default:
                System.err.println("Please Enter correct choice");
                outWear();
        }
	}
	
	public void goBack(String style) {
		if(style.equals(AppConstants.formalStyle)) {
			formalWear();
		}else if(style.equals(AppConstants.casualStyle)) {
			casualWear();
		}else if(style.equals(AppConstants.activeWearStyle)) {
			activeWear();
		}else if(style.equals(AppConstants.outWearStyle)) {
			outWear();
		}
	}
	
	public void shirts(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.shirtCategory);
	}
	
	public void tshirts(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.tshirtCategory);
	}
	
	public void jeans(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.jeansCategory);
	}
	
	public void chinos(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.chinosCategory);
	}
	
	public void pants(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.pantCategory);
	}
	
	public void blazer(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.blazerCategory);
	}
	
	public void sweaters(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.sweaterCategory);
	}
	
	public void jackets(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.jacketCategory);
	}
	
	public void coats(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.coatsCategory);
	}
	
	public void hoodies(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.hoodiesCategory);
	}
	
	public void suits(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.suitsCategory);
	}
	
	public void shoes(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.shoesCategory);
	}
	
	public void shorts(String style) {
		productPage(AppConstants.mensSection,style,AppConstants.shortsCategory);
	}
}
