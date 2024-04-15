package com.shoplify.service.fashion;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.shoplify.model.CartItem;
import com.shoplify.model.FashionProduct;
import com.shoplify.model.User;
import com.shoplify.repository.FashionRepository;
import com.shoplify.service.Authentication;
import com.shoplify.service.AuthenticationImpl;
import com.shoplify.service.CartService;
import com.shoplify.service.ProductService;
import com.shoplify.service.Session;
import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class FashionService extends ProductService{
	
	FashionRepository fashionRepository = new FashionRepository();
	
	public static void init() {
		FashionRepository.init();
	}
	
	public void fashionCategory() {
		System.out.println("Enter 1 for Men");
		System.out.println("Enter 2 for Women");
		System.out.println("Enter 3 for Kids");
		System.out.println("Enter 4 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			MenService m = new MenService();
			m.menSection();
			break;
		case 2: 
			WomenService w = new WomenService();
			w.womenSection();
			break;
		case 3: 
			KidsService k = new KidsService();
			k.kidsSection();
			break;
		case 4:
			homePage();
			break;
		default:
			System.err.println("Invalid Input");
			fashionCategory();
		}
	}
	
	public void productPage(String sec,String style,String cat) {
		InputHandler sc = new InputHandler();
		List<FashionProduct> products = fashionRepository.findProductsByCategorySectionAndStyle(cat,style,sec);
		
		Collections.sort(products);
		
		Collections.sort(products);
		int i = 1;
		if(products.size()==0) {
			System.err.println("No Products in this category");
		}
		for(FashionProduct p: products) {
			System.out.println(i+") "+p.getName()+" Brand: "+p.getBrand()+", Price: "+p.getPrice()+", "+p.getDescription().substring(0,25)+"...");
			i++;
		}
		System.out.println(products.size()+1+") to go back");
		
		System.out.print("Choose opions: ");
		int option = sc.nextInt();
		
		//back logic
		if(option==products.size()+1) {
			if(sec.equals(AppConstants.mensSection)) {
				MenService menService = new MenService();
				menService.goBack(style);
			}else if(sec.equals(AppConstants.womensSection)) {
				WomenService womenService = new WomenService();
				womenService.goBack(style);
				
			}else if(sec.equals(AppConstants.kidsSection)) {
				KidsService kidsService = new KidsService();
				kidsService.goBack(style);
				
			}
		}else if(option<=products.size() && option>0) {
			FashionProduct p = products.get(option-1);
			productDetails(p);
			System.out.println("Enter 1 to add in cart");
			System.out.println("Enter any Number key to go back");
			option = sc.nextInt();
			if(option==1) {
				addToCart(p);
				cartPage();
			}else {
				productPage(sec,style,cat);
			}
		}else {
			System.err.println("Enter correct Option");
			productPage(sec,style,cat);
		}
	}
	
	public String chooseSize(List<String> sizes) {
		InputHandler sc = new InputHandler();
		System.out.println("Choose size: "+sizes);
		String size = sc.nextLine();
		if(!sizes.contains(size.toLowerCase())) {
			System.err.println("Size is not avalaible");
			return chooseSize(sizes);
		}
		return size;
	}
	public String chooseColor(List<String> colors) {
		InputHandler sc = new InputHandler();
		System.out.println("Choose color: "+colors);
		String color = sc.nextLine();
		if(!colors.contains(color.toLowerCase())) {
			System.err.println("Color is not avalaible");
			return chooseColor(colors);
		}
		return color;
	}
	
	public void addToCart(FashionProduct p) {
		User user = Session.getUser();
		if(user==null) {
			Authentication auth = new AuthenticationImpl();
			System.err.println("Logged In First");
			auth.login();
			user = Session.getUser();
		}
		String size = chooseSize(p.getSize());
		String color = chooseColor(p.getColor());
		Map<String,String> props = new LinkedHashMap<>();
		props.put("size",size.toLowerCase());
		props.put("color", color.toLowerCase());
		CartItem item = new CartItem(props,p);
		CartService cartService = new CartService();
		cartService.addCartItems(user, item);
	}
	
	public void productDetails(FashionProduct p) {
		System.out.println("========================================================");
		System.out.println("Name: "+p.getName());
		System.out.println("Brand: "+p.getBrand());
		System.out.println("Material: "+p.getMaterial());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Discount: "+p.getDiscountPercent());
		System.out.println("Colors: "+p.getColor());
		System.out.println("Sizes: "+p.getSize());
		System.out.println(p.getDescription());
		System.out.println("========================================================");
	}
	
	
}
