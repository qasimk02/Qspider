package com.shoplify.model;

import java.util.List;

public class ElectronicsProduct extends Product{
	
	List<String> colors;
	double warranty;
	double weight;
	String type;
	
	public ElectronicsProduct(String name, String brand, int qty, double price, double discountPercent,
			String description, boolean isActive, List<String> colors, double warranty, double weight,String type) {
		super(name, brand, qty, price, discountPercent, description, isActive);
		this.colors = colors;
		this.warranty = warranty;
		this.weight = weight;
		this.type = type;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "ElectronicsProduct [colors=" + colors + ", warranty=" + warranty + ", weight=" + weight + "]";
	}
	
}
