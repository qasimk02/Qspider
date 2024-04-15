package com.shoplify.service.electronicsService;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.shoplify.model.CartItem;
import com.shoplify.model.HomeAppliances;
import com.shoplify.model.MobileAndLaptops;
import com.shoplify.model.User;
import com.shoplify.model.Wearable;
import com.shoplify.repository.ElectronicsProductRepository;
import com.shoplify.service.Authentication;
import com.shoplify.service.AuthenticationImpl;
import com.shoplify.service.CartService;
import com.shoplify.service.ProductService;
import com.shoplify.service.Session;
import com.shoplify.util.InputHandler;

public class ElectronicsService extends ProductService{
	
	ElectronicsProductRepository electronicsRepository = new ElectronicsProductRepository();
	
	public static void init() {
		ElectronicsProductRepository.init();
	}
	public void electronicsCategory() {
		
		System.out.println("Enter 1 for Wearable Technology");
		System.out.println("Enter 2 for Mobile and Laptops");
		System.out.println("Enter 3 for Home Appliances");
		System.out.println("Enter 4 to go back");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			WearableService w = new WearableService();
			w.wearableProducts();
			break;
		case 2: 
			MobileAndLaptopService ml = new MobileAndLaptopService();
			ml.mobileAndLaptopProducts();
			break;
		case 3: 
			HomeApplianceService h = new HomeApplianceService();
			h.homeAppliancesProducts();
			break;
		case 4:
			homePage();
			break;
		default:
			System.err.println("Invalid Input");
			electronicsCategory();
		}
		
	}
	
	
	public void mobileAndLaptopsProductPage(String type) {
		List<MobileAndLaptops> products = electronicsRepository.getMobileAndLaptopsByType(type);
		Collections.sort(products);
		int i = 1;
		if(products.size()==0) {
			System.err.println("No Products in this category");
		}
		for(MobileAndLaptops p: products) {
			System.out.println(i+") "+p.getName()+" Brand: "+p.getBrand()+", Price: "+p.getPrice()+", "+p.getDescription().substring(0,25)+"...");
			i++;
		}
		System.out.println(products.size()+1+") to go back");
		
		InputHandler sc = new InputHandler();
		System.out.print("Choose opions: ");
		int option = sc.nextInt();

		if(option==products.size()+1) {
			MobileAndLaptopService mobileAndLaptopService = new MobileAndLaptopService();
			mobileAndLaptopService.mobileAndLaptopProducts();
		}else if(option<=products.size() && option>0){
			MobileAndLaptops p = products.get(option-1);
			mobileAndLaptopProductcDetials(p);
			System.out.println("Enter 1 to add in cart");
			System.out.println("Enter any Number key to go back");
			option = sc.nextInt();
			if(option==1) {
				addMobileOrLaptopToCart(p);
				cartPage();
			}else {
				mobileAndLaptopsProductPage(type);
			}
		}else {
			System.err.println("Choose correct option");
			mobileAndLaptopsProductPage(type);
		}
	}
	
	public String chooseColor(List<String> colors) {
		InputHandler sc = new InputHandler();
		System.out.println("Choose color: "+colors);
		String color = sc.nextLine();
		boolean found = false;
		for(String c: colors) {
			if(c.equalsIgnoreCase(color)) {
				found = true;
				break;
			}
		}
		if(!found) {
			System.err.println("Color not available! Please Choose appropriate Color");
			chooseColor(colors);
		}
		return color;
	}
	
	public String chooseRam(List<String> rams) {
		InputHandler sc = new InputHandler();
		System.out.println("Choose ram: "+rams);
		String ram = sc.nextLine();
		if(!rams.contains(ram.toUpperCase())) {
			System.err.println("Ram is not avalaible");
			return chooseRam(rams);
		}
		return ram;
	}
	
	public String chooseStorage(List<String> storages) {
		InputHandler sc = new InputHandler();
		System.out.println("Choose Storage: "+storages);
		String storage = sc.nextLine();
		if(!storages.contains(storage.toUpperCase())) {
			System.err.println("Storage is not avalaible");
			return chooseStorage(storages);
		}
		return storage;
	}
	
	public void addMobileOrLaptopToCart(MobileAndLaptops p) {
		User user = Session.getUser();
		if(user==null) {
			Authentication auth = new AuthenticationImpl();
			System.err.println("Logged In First");
			auth.login();
			user = Session.getUser();
		}
		String ram = chooseRam(p.getRam());
		String storage = chooseStorage(p.getStorage());
		String color = chooseColor(p.getColors());
		String warranty = p.getWarranty()+"";
		Map<String,String> props = new LinkedHashMap<>();
		props.put("ram",ram.toLowerCase());
		props.put("warranty", color);
		props.put("storage", storage.toLowerCase());
		props.put("color", warranty);
		CartItem item = new CartItem(props,p);
		CartService cartService = new CartService();
		cartService.addCartItems(user, item);
	}
	public void mobileAndLaptopProductcDetials(MobileAndLaptops p) {
		System.out.println("========================================================");
		System.out.println("Name: "+p.getName());
		System.out.println("Brand: "+p.getBrand());
		System.out.println("RAM: "+p.getRam());
		System.out.println("Storage: "+p.getStorage());
		System.out.println("Camera: "+p.getCamera());
		System.out.println("CPU: "+p.getCpu());
		System.out.println("Color: "+p.getColors());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Discount: "+p.getDiscountPercent());
		System.out.println(p.getDescription());
		System.out.println("========================================================");
	}
	
	
	public void homeAppliancesProductPage(String type) {
		List<HomeAppliances> products = electronicsRepository.getHomeAppliancesByType(type);
		Collections.sort(products);
		int i = 1;
		if(products.size()==0) {
			System.err.println("No Products in this category");
		}
		for(HomeAppliances p: products) {
			System.out.println(i+") "+p.getName()+" Brand: "+p.getBrand()+", Price: "+p.getPrice()+", "+p.getDescription().substring(0,25)+"...");
			i++;
		}
		System.out.println(products.size()+1+") to go back");
		
		InputHandler sc = new InputHandler();
		System.out.print("Choose opions: ");
		int option = sc.nextInt();

		if(option==products.size()+1) {
			HomeApplianceService homeApplianceService = new HomeApplianceService();
			homeApplianceService.homeAppliancesProducts();
		}else if(option<=products.size() && option>0){
			HomeAppliances p = products.get(option-1);
			homeAppliancesProductDetails(p);
			System.out.println("Enter 1 to add in cart");
			System.out.println("Enter any Number key to go back");
			option = sc.nextInt();
			if(option==1) {
				addHomeAppliancesToCart(p);
				cartPage();
			}else {
				homeAppliancesProductPage(type);
			}
		}else {
			System.err.println("Choose correct option");
			homeAppliancesProductPage(type);
		}
	}
	public void homeAppliancesProductDetails(HomeAppliances p) {
		System.out.println("========================================================");
		System.out.println("Name: "+p.getName());
		System.out.println("Brand: "+p.getBrand());
		System.out.println("RAM: "+p.getCapacity());
		System.out.println("Storage: "+p.getDimensions());
		System.out.println("Camera: "+p.getWarranty());
		System.out.println("CPU: "+p.getWeight());
		System.out.println("Color: "+p.getColors());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Discount: "+p.getDiscountPercent());
		System.out.println(p.getDescription());
		System.out.println("========================================================");
		
	}
	public void addHomeAppliancesToCart(HomeAppliances p) {
		User user = Session.getUser();
		if(user==null) {
			Authentication auth = new AuthenticationImpl();
			System.err.println("Logged In First");
			auth.login();
			user = Session.getUser();
		}
		String capacity = p.getCapacity();
		String dimensions = p.getDimensions();
		String warranty = p.getWarranty()+"";
		String color = chooseColor(p.getColors());
		
		Map<String,String> props = new LinkedHashMap<>();
		props.put("color", color);
		props.put("capacity",capacity);
		props.put("dimensions", dimensions);
		props.put("warranty", warranty);
		
		CartItem item = new CartItem(props,p);
		CartService cartService = new CartService();
		cartService.addCartItems(user, item);
		
	}

	public void wearableProductPage(String type) {
		List<Wearable> products = electronicsRepository.getWearableByType(type);
		Collections.sort(products);
		int i = 1;
		if(products.size()==0) {
			System.err.println("No Products in this category");
		}
		for(Wearable p: products) {
			System.out.println(i+") "+p.getName()+" Brand: "+p.getBrand()+", Price: "+p.getPrice()+", "+p.getDescription().substring(0,25)+"...");
			i++;
		}
		System.out.println(products.size()+1+") to go back");
		
		InputHandler sc = new InputHandler();
		System.out.print("Choose opions: ");
		int option = sc.nextInt();

		if(option==products.size()+1) {
			WearableService wearableService = new WearableService();
			wearableService.wearableProducts();
		}else if(option<=products.size() && option>0){
			Wearable p = products.get(option-1);
			wearableProductDetails(p);
			System.out.println("Enter 1 to add in cart");
			System.out.println("Enter any Number key to go back");
			option = sc.nextInt();
			if(option==1) {
				addWearableToCart(p);
				cartPage();
			}else {
				wearableProductPage(type);
			}
		}else {
			System.err.println("Choose correct option");
			wearableProductPage(type);
		}
	}
	public void addWearableToCart(Wearable p) {
		User user = Session.getUser();
		if(user==null) {
			Authentication auth = new AuthenticationImpl();
			System.err.println("Logged In First");
			auth.login();
			user = Session.getUser();
		}
		String battery = p.getBattery();
		String connectivity = p.getConnectivity();
		String warranty = p.getWarranty()+"";
		String color = chooseColor(p.getColors());
		
		Map<String,String> props = new LinkedHashMap<>();
		props.put("battery",battery);
		props.put("connectivity", connectivity);
		props.put("waranty", warranty);
		props.put("color", color);
		CartItem item = new CartItem(props,p);
		CartService cartService = new CartService();
		cartService.addCartItems(user, item);
		
	}
	public void wearableProductDetails(Wearable p) {
		
		System.out.println("========================================================");
		System.out.println("Name: "+p.getName());
		System.out.println("Brand: "+p.getBrand());
		System.out.println("RAM: "+p.getBattery());
		System.out.println("Storage: "+p.getConnectivity());
		System.out.println("Storage: "+p.getSesonrs());
		System.out.println("Camera: "+p.getWarranty());
		System.out.println("CPU: "+p.getWeight());
		System.out.println("Color: "+p.getColors());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Discount: "+p.getDiscountPercent());
		System.out.println(p.getDescription());
		System.out.println("========================================================");
		
	}
	
}