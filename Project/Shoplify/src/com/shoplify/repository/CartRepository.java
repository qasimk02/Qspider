package com.shoplify.repository;

import java.util.ArrayList;
import java.util.List;

import com.shoplify.model.Cart;
import com.shoplify.model.User;

public class CartRepository {
		
	static List<Cart> carts = new ArrayList<>();
	
	public Cart createCart(User user) {
		Cart cart = new Cart(user,new ArrayList<>());
		carts.add(cart);
		return cart;
	}
	
	public Cart getCartByUser(User user) {
		Cart cart = null;
		for(Cart c: carts) {
			if(c.getUser().equals(user)) {
				cart = c;
			}
		}
		return cart;
	}
	
	public Cart deleteCartItems(User user) {
		Cart cart = getCartByUser(user);
		if(cart!=null) {
			cart.getCartItems().clear();
			cart.setTotalAmt(0);
			cart.setTotalDiscountedAmt(0);
		}
		return cart;
	}
	
	
	
}
