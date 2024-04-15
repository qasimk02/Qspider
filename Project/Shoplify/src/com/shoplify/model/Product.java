package com.shoplify.model;

public class Product implements Comparable<Product>{
	
	String name;
	String brand;
	int qty;
	double price;
	double discountPercent;
	String description;
	boolean isActive;
	
	@Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
	
	public Product(String name, String brand, int qty, double price, double discountPercent, String description,boolean isActive) {
		super();
		this.name = name;
		this.brand = brand;
		this.qty = qty;
		this.price = price;
		this.discountPercent = discountPercent;
		this.description = description;
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
	
}
