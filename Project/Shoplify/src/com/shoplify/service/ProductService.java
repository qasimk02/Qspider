package com.shoplify.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shoplify.Shoplify;
import com.shoplify.model.Cart;
import com.shoplify.model.CartItem;
import com.shoplify.model.ElectronicsProduct;
import com.shoplify.model.FashionProduct;
import com.shoplify.model.HomeAppliances;
import com.shoplify.model.MobileAndLaptops;
import com.shoplify.model.Order;
import com.shoplify.model.OrderItem;
import com.shoplify.model.Product;
import com.shoplify.model.User;
import com.shoplify.model.Wearable;
import com.shoplify.repository.ElectronicsProductRepository;
import com.shoplify.repository.FashionRepository;
import com.shoplify.service.electronicsService.ElectronicsService;
import com.shoplify.service.fashion.FashionService;
import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;


public class ProductService {
	
	public void homePage() {
		System.out.println("Enter 1 for Fashion");
		System.out.println("Enter 2 for Electronics");
		System.out.println("Enter 3 for Beauty Products");
		System.out.println("Enter 4 to search Products");
		System.out.println("Enter 5 to Open Cart");
		System.out.println("Enter 6 to Order details");
		System.out.println("Enter 7 to Logout");
		System.out.println("Enter 8 to Exit");
		InputHandler sc = new InputHandler();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			FashionService f = new FashionService();
			f.fashionCategory();
			break;
		case 2: 
			ElectronicsService el = new ElectronicsService();
			el.electronicsCategory();
			break;
		case 3: 
			System.err.println("No Product in this cateogry");
			System.out.println("You can search for related products");
		case 4:
			search();
			break;
		case 5:
			cartPage();
			break;
		case 6:
			orderPage();
			break;
		case 7:
			Session.setUser(null);
			System.out.println("LOGOUT SUCCESSFULLY");
			Shoplify.main(null);
			break;
		case 8:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default:
			System.err.println("Invalid Input");
			homePage();
		}
	}
	
	public void search() {
		InputHandler sc = new InputHandler();
		FashionRepository fashionRepository = new FashionRepository();
		ElectronicsProductRepository elecRepository = new ElectronicsProductRepository();
		
		List<FashionProduct> f = fashionRepository.getAllProducts();
		List<MobileAndLaptops> ml = elecRepository.getAllMobilieAndLaptops();
		List<Wearable> w = elecRepository.getAllWearables();
		List<HomeAppliances> ha = elecRepository.getAllHomeAppliances();
		
		List<Product> searchResult = new ArrayList<>();
		System.out.println("Enter keyword to search product");
		String str = sc.nextLine();
		for(FashionProduct el: f) {
			if(el.getBrand().contains(str) || el.getDescription().contains(str) 
					|| el.getMaterial().contains(str) || el.getName().contains(str)) {
				searchResult.add(el);
			}
		}
		for(MobileAndLaptops el: ml) {
			if(el.getBrand().contains(str) || el.getDescription().contains(str) 
					|| el.getName().contains(str)) {
				searchResult.add(el);
			}
		}
		for(Wearable el: w) {
			if(el.getBrand().contains(str) || el.getDescription().contains(str) 
					|| el.getSesonrs().contains(str) || el.getName().contains(str)) {
				searchResult.add(el);
			}
		}
		for(HomeAppliances el: ha) {
			if(el.getBrand().contains(str) || el.getDescription().contains(str) 
					 || el.getName().contains(str)){
				searchResult.add(el);
			}
		}
		
		processSearch(searchResult);
		
		
	}
	public int getOption() {
		System.out.println("Enter 1 to add in Cart");
		System.out.println("Enter 2 to go back");
		
		InputHandler sc = new InputHandler();
		return sc.nextInt();
	
	}
	public void processSearch(List<Product> searchResult) {
		InputHandler sc = new InputHandler();
		
		int i = 1;
		for(Product p: searchResult) {
			System.out.println(i+") "+p.getName()+" | Brand: "+p.getBrand()+" |  Price: "+p.getPrice()+" | "+p.getDescription().substring(0,25)+"...");
			i++;
		}
		System.out.println("Enter "+i+" to go back");
		System.out.println("Choose appropriate options");
		int option = sc.nextInt();
		if(option>0 && option<=searchResult.size()) {
			Product p = searchResult.get(option-1);
			
			if(p instanceof FashionProduct) {
				FashionService fashionService = new FashionService();
				fashionService.productDetails((FashionProduct)p);
				option = getOption();
				if(option==1) {
					fashionService.addToCart((FashionProduct)p);
					cartPage();
				}else {
					processSearch(searchResult);
				}
				
			}else if(p instanceof ElectronicsProduct) {
				ElectronicsService electronicsService = new ElectronicsService();
				if(p instanceof Wearable) {
					electronicsService.wearableProductDetails((Wearable)p);
					option = getOption();
					if(option==1) {
						electronicsService.addWearableToCart((Wearable)p);
						cartPage();
					}else {
						processSearch(searchResult);
					}
				}else if(p instanceof HomeAppliances) {
					electronicsService.homeAppliancesProductDetails((HomeAppliances)p);
					option = getOption();
					if(option==1) {
						electronicsService.addHomeAppliancesToCart((HomeAppliances)p);
						cartPage();
					}else {
						processSearch(searchResult);
					}
				}else if(p instanceof MobileAndLaptops) {
					electronicsService.mobileAndLaptopProductcDetials((MobileAndLaptops)p);
					option = getOption();
					if(option==1) {
						electronicsService.addMobileOrLaptopToCart((MobileAndLaptops)p);
						cartPage();
					}else {
						processSearch(searchResult);
					}
				}
			}
		}else {
			homePage();
		}
	}
    
	public void cartPage() {
    	User user = Session.getUser();
    	if(user==null) {
    		Authentication auth = new AuthenticationImpl();
    		System.err.println("Login to open cart");
    		auth.login();
    		user = Session.getUser();
    	}
    	
    	if(user.getRole().equals(AppConstants.adminUser)) {
    		AdminService adminService = new AdminService();
    		adminService.admin();
    	}
    	
    	CartService cartService = new CartService();
    	Cart cart = cartService.getCartByUser(user);
    	
    	System.out.println("-----------Cart Details---------------");
    	System.out.println(cart.getUser().getName());

    	if(cart.getCartItems().size()==0) {
    		System.err.println("There is no Item in your cart");
    		System.out.println("Redirecting to home Page");
    		homePage();
    	}
    	System.out.println("Products in cart");
    	for(CartItem item: cart.getCartItems()) {
    		Product p = item.getProduct();
    		System.out.print(p.getName()+", "+p.getBrand()+", "+p.getPrice());
    		Map<String, String> props = item.getProperties();
    		for (Map.Entry<String, String> entry : props.entrySet()) {
    		    String key = entry.getKey();
    		    String value = entry.getValue();
    		    System.out.print(", "+key.toUpperCase()+": "+value.toUpperCase()+" ");
    		}
    		System.out.println();
    		
    	}
    	System.out.println("Total Price: "+cart.getTotalAmt());
    	System.out.println("Total Discounted price: "+cart.getTotalDiscountedAmt());
    	System.out.println("---------------------------------------");
    	
    	System.out.println("Enter 1 to Order");
    	System.out.println("Enter 2 to navigate to Home Page");
    	
    	InputHandler sc = new InputHandler();
    	int option = sc.nextInt();
    	
    	switch(option) {
    	case 1:
    		OrderService orderService = new OrderService();
    		PaymentService paymentService = new PaymentServiceImpl();
    		
    		System.out.println("Enter delivery Address: ");
    		String address = sc.nextLine();
    		Order order =orderService.createOrder(cart, address, user.getPhoneNumber());
    		System.out.println("Redirecting to Payment page");
    		System.out.println("Loading...");
    		paymentService.paymentOptions(order.getTotalAmt());
    		order.setStatus(AppConstants.PLACED);
    		cartService.deleteCartItems(user);
    		System.out.println("Your order has been placed succesfully");
    		orderPage();
    		break;
    	case 2:
    		homePage();
    		break;
    	default:
    		homePage();
    		break;
    	}
    }
	 
    public void orderPage() {
    	User user = Session.getUser();
    	if(user==null) {
    		Authentication auth = new AuthenticationImpl();
    		System.err.println("Login to track your order");
    		auth.login();
    		user = Session.getUser();
    	}
    	
    	if(user.getRole().equals(AppConstants.adminUser)) {
    		AdminService adminService = new AdminService();
    		adminService.admin();
    	}
    	
    	OrderService orderService = new OrderService();
    	List<Order> orders = orderService.getOrders(user);
    	
    	System.out.println("-----------Order Details---------------");
    	System.out.println(user.getName());

    	System.out.println("Products in order");
    	int orderNumber = 1;
    	for(Order order: orders) {
    		System.out.println("---Order Number "+orderNumber+"----");
    		System.out.println("Order Status: "+order.getStatus()+ ", Total Amount: "+order.getTotalAmt()+", "+order.getOrderItems().size()+" Order Items");
    		orderNumber++;
    	}
    	
    	
    	InputHandler sc = new InputHandler();
    	System.out.println("Enter 1 to navigate on home page");
    	System.out.println("Enter 2 to see order details");
    	int option = sc.nextInt();
    	if(option==2) {
    		System.out.println("Enter order Number to view Order details");
    		int oNum = sc.nextInt();
    		if(oNum>0 && oNum<=orders.size()) {
    			orderDetails(orders.get(oNum-1),oNum);
    		}else {
    			System.out.println("Order Doesn't exist");
    		}
    	}
    	
    	homePage();
    }
    
    public void orderDetails(Order order,int orderNumber) {
    	
    	System.out.println("-------------Order "+orderNumber+" details-----------------");
		for(OrderItem item: order.getOrderItems()) {
    		Product p = item.getProduct();
    		System.out.print(p.getName()+", "+p.getBrand()+", "+p.getPrice());
    		Map<String, String> props = item.getProperties();
    		for (Map.Entry<String, String> entry : props.entrySet()) {
    		    String key = entry.getKey();
    		    String value = entry.getValue();
    		    System.out.print(", "+key.toUpperCase()+": "+value.toUpperCase()+" ");
    		}
    		System.out.println();
    	}
		System.out.println("Total Price: "+order.getTotalAmt());
		System.out.println("Order Status: "+order.getStatus());
		
		
		System.out.println("Enter any key to go back");
		InputHandler sc = new InputHandler();
		sc.nextInt();
		orderPage();
		
    }

}
