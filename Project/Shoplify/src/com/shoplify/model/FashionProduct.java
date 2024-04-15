package com.shoplify.model;

import java.util.List;

public class FashionProduct extends Product{

	String material;
	List<String> size;
	List<String> color;
	String style;
	String section;
	String category;

	public FashionProduct(String name, String brand, int qty, double price, double discountPercent, String description,
			boolean isActive, String material, List<String> size, List<String> color, String style, String section,String category) {
		super(name, brand, qty, price, discountPercent, description, isActive);
		this.material = material;
		this.size = size;
		this.color = color;
		this.style = style;
		this.section = section;
		this.category = category;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public List<String> getSize() {
		return size;
	}

	public void setSize(List<String> size) {
		this.size = size;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "FashionProduct [name=" + name + ", brand=" + brand + ", qty=" + qty + ", price=" + price + ", discountPercent="
				+ discountPercent + ", description=" + description + ", isActive=" + isActive+" material=" + material + ", size=" + size + ", color=" + color + ", style=" + style
				+ ", section=" + section + ", category="+category+"]";
	}
	
}
