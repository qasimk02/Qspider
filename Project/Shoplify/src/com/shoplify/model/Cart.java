package com.shoplify.model;

import java.util.List;

public class Cart {

	User user;
	List<CartItem> cartItems;
	double totalAmt;
	double totalDiscountedAmt;
	
	public Cart(User user,List<CartItem> cartItem){
		this.user = user;
		this.cartItems = cartItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public double getTotalDiscountedAmt() {
		return totalDiscountedAmt;
	}

	public void setTotalDiscountedAmt(double totalDiscountedAmt) {
		this.totalDiscountedAmt = totalDiscountedAmt;
	}

	@Override
	public String toString() {
		return "Cart [user=" + user + ", cartItems=" + cartItems + ", totalAmt=" + totalAmt + ", totalDiscountedAmt="
				+ totalDiscountedAmt + "]";
	}
	
	
	
}
