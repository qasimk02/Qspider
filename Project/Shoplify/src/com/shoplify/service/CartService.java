package com.shoplify.service;

import com.shoplify.model.Cart;
import com.shoplify.model.CartItem;
import com.shoplify.model.User;
import com.shoplify.repository.CartRepository;

public class CartService {
	CartRepository cartRepository = new CartRepository();
	
	
	public Cart getCartByUser(User user) {
		return cartRepository.getCartByUser(user);
	}
	
	public Cart createCart(User user) {
		return cartRepository.createCart(user);
	}
	
	public Cart addCartItems(User user,CartItem item) {
		Cart cart = getCartByUser(user);
		cart.getCartItems().add(item);
		cart.setTotalAmt(cart.getTotalAmt()+item.getProduct().getPrice());
		double discPrice = item.getProduct().getPrice()*item.getProduct().getDiscountPercent()/100;
		cart.setTotalDiscountedAmt(cart.getTotalDiscountedAmt()+discPrice);
		return cart;
	}
	
	public Cart removeCartItems(User user,CartItem item) {
		Cart cart = getCartByUser(user);
		cart.getCartItems().remove(item);
		return cart;
	}
	
	public Cart deleteCartItems(User user) {
		return cartRepository.deleteCartItems(user);
	}
	
	
}
