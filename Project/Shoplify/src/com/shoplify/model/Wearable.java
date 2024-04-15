package com.shoplify.model;

import java.util.List;

public class Wearable extends ElectronicsProduct{
	
	String sesonrs;
	String connectivity;
	String battery;
	
	
	
	public Wearable(String name, String brand, int qty, double price, double discountPercent, String description,
			boolean isActive, List<String> colors, double warranty, double weight,  String sesonrs,
			String connectivity, String battery, String type) {
		super(name, brand, qty, price, discountPercent, description, isActive, colors, warranty, weight,type);
		this.sesonrs = sesonrs;
		this.connectivity = connectivity;
		this.battery = battery;
	}

	public String getSesonrs() {
		return sesonrs;
	}



	public void setSesonrs(String sesonrs) {
		this.sesonrs = sesonrs;
	}



	public String getConnectivity() {
		return connectivity;
	}



	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}



	public String getBattery() {
		return battery;
	}



	public void setBattery(String battery) {
		this.battery = battery;
	}



	@Override
	public String toString() {
		return "Wearable [sesonrs=" + sesonrs + ", connectivity=" + connectivity + ", battery="
				+ battery + "]";
	}
	
	
	
}	
