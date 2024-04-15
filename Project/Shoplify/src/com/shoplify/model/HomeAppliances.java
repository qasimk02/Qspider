package com.shoplify.model;

import java.util.List;

public class HomeAppliances extends ElectronicsProduct{
	
	String capacity;
	String dimensions;
	
	public HomeAppliances(String name, String brand, int qty, double price, double discountPercent, String description,
			boolean isActive, List<String> colors, double warranty, double weight, String capacity, String dimensions, String type) { 
		super(name, brand, qty, price, discountPercent, description, isActive, colors, warranty, weight,type);
		this.capacity = capacity;
		this.dimensions = dimensions;
	}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public String getDimensions() {
		return dimensions;
	}


	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}


	@Override
	public String toString() {
		return "HomeAppliances [capacity=" + capacity + ", dimensions=" + dimensions + "]";
	}
	
	
	
}
