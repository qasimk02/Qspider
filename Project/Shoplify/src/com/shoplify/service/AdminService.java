package com.shoplify.service;

import java.util.List;

import com.shoplify.Shoplify;
import com.shoplify.model.Order;
import com.shoplify.model.User;
import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class AdminService {
	
	
	public void admin() {
		System.out.println("Enter 1 to view all the orders");
		System.out.println("Enter 2 to view all the users");
		System.out.println("Enter 3 to logout");
		InputHandler sc = new InputHandler();
		int option = sc.nextInt();
		switch(option) {
		case 1:
			allOrders();
			break;
		case 2:
			allUsers();
			break;
		case 3:
			Session.setUser(null);
			System.out.println("LOGOUT SUCCESSFULLY");
			Shoplify.main(null);
			break;
		default:
			System.err.println("Enter appropriate option");
			admin();
			break;
		}
	}

	public void allOrders() {
		InputHandler sc = new InputHandler();
		OrderService orderService = new OrderService();
		List<Order> orders = orderService.getAllOrders();
		int i = 1;
		for(Order order: orders) {
			System.out.println("---Order Number "+i+"----");
    		System.out.println("Order Status: "+order.getStatus()+ ", Total Amount: "+order.getTotalAmt()+", "+order.getOrderItems().size()+" Order Items");
			i++;
		}
		
		if(orders.size()==0) {
			System.err.println("No order is been placed");
		}else {
			System.out.println("Enter order number to update status");
		}

		System.out.println("Enter "+ (orders.size()+1) +" to go back");
		int option = sc.nextInt();
		if(option>0 && option<=orders.size()) {
			Order order = orders.get(option-1);
			System.out.println("Enter 1 to CONFIRM order");
			System.out.println("Enter 2 to SHIPPED order");
			System.out.println("Enter 3 to mark OUT FOR DELIVERY order");
			System.out.println("Enter 4 to mark DELIVERED order");
			System.out.println("Enter 5 to CANCELL the order");
			
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				order.setStatus(AppConstants.CONFIRMED);
				break;
			case 2:
				order.setStatus(AppConstants.SHIPPED);
				break;
			case 3:
				order.setStatus(AppConstants.OUT_FOR_DELIVERY);
				break;
			case 4:
				order.setStatus(AppConstants.DELIVERED);
				break;
			case 5:
				order.setStatus(AppConstants.CANCELLED);
				break;
			default:
				System.err.println("Choose appropriate option");
				allOrders();
				break;
			}
			
			allOrders();
		}
		
		admin();
		
		
		
		
		
	}


	public void allUsers() {
		UserService userService = new UserService();
		List<User> users = userService.getAllUsers();

		int i = 1;
		for(User u: users) {
				System.out.println(i+") "+u.getName()+", "+u.getEmail()+", "+u.getCreatedAt()+", "+u.getAddress());
				i++;
		}

		System.out.println("Enter any number key to go back");
		InputHandler sc = new InputHandler();
		sc.nextInt();
		admin();
	}
}
