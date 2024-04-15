package com.shoplify.repository;

import java.util.List;
import java.util.ArrayList;

import com.shoplify.model.Order;
import com.shoplify.model.User;

public class OrderRepository {

	static List<Order> orders = new ArrayList<>();

	public Order createOrder(Order order) {
		orders.add(order);
		return order;
	}
	
	public List<Order> getUserOrders(User user){
		List<Order> res = new ArrayList<>();
		for(Order o : orders) {
			if(o.getUser().equals(user)) {
				res.add(o);
			}
		}
		return res;
	}
	
	//admin
	public List<Order> getAllOrders(){
		return orders;
	}
	
}
