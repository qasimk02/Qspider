package com.shoplify.service;

import java.util.ArrayList;
import java.util.List;

import com.shoplify.model.Cart;
import com.shoplify.model.CartItem;
import com.shoplify.model.Order;
import com.shoplify.model.OrderItem;
import com.shoplify.model.User;
import com.shoplify.repository.OrderRepository;
import com.shoplify.util.AppConstants;

public class OrderService {
	
	OrderRepository orderRepository = new OrderRepository();
	
	public Order createOrder(Cart cart,String address,String phoneNumber) {
		List<OrderItem> orderItems= new ArrayList<>();
		for(CartItem item: cart.getCartItems()) {
			orderItems.add(new OrderItem(item.getProperties(),item.getProduct()));
		}
		
		Order order = new Order(cart.getUser(),orderItems,cart.getTotalDiscountedAmt(),0.0,AppConstants.PENDING,address,phoneNumber);
		Order createdOrder = orderRepository.createOrder(order);
		
		return createdOrder;
	}
	
	public List<Order> getOrders(User user){
		return orderRepository.getUserOrders(user);
	}
	
	//admin
	public List<Order> getAllOrders(){
		return orderRepository.getAllOrders();
	}
	
	public void placeOrder(Order order) {
		order.setStatus(AppConstants.PLACED);
	}
	
	public void confirmOrder(Order order) {
		order.setStatus(AppConstants.CONFIRMED);
	}
	
	public void shippOrder(Order order) {
		order.setStatus(AppConstants.SHIPPED);
	}
	
	public void markOutForDelivery(Order order) {
		order.setStatus(AppConstants.OUT_FOR_DELIVERY);
	}
	
	public void markDelivered(Order order) {
		order.setStatus(AppConstants.DELIVERED);
	}
	
	public void cancelOrder(Order order) {
		order.setStatus(AppConstants.CANCELLED);
	}
	
}
