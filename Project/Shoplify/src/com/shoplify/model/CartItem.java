package com.shoplify.model;

import java.util.Map;

public class CartItem {
	
	Map<String,String> properties;
	Product product;
	
	public CartItem(Map<String, String> properties, Product product) {
		super();
		this.properties = properties;
		this.product = product;
	}
	
	public Map<String, String> getProperties() {
		return properties;
	}



	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	@Override
	public String toString() {
		return "CartItems [properties=" + properties + ", product=" + product + "]";
	}
	
	
	
}
