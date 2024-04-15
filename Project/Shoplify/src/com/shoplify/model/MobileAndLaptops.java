package com.shoplify.model;

import java.util.List;

public class MobileAndLaptops extends ElectronicsProduct{
	
	String os;
	String cpu;
	List<String> ram;
	List<String> storage;
	String battery;
	String camera;
	
	public MobileAndLaptops(String name, String brand, int qty, double price, double discountPercent,
			String description, boolean isActive, List<String> colors, double warranty, double weight, String type,
			String os, String cpu, List<String> ram, List<String> storage, String battery, String camera) {
		super(name, brand, qty, price, discountPercent, description, isActive, colors, warranty, weight, type);
		this.os = os;
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
		this.battery = battery;
		this.camera = camera;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public List<String> getRam() {
		return ram;
	}

	public void setRam(List<String> ram) {
		this.ram = ram;
	}

	public List<String> getStorage() {
		return storage;
	}

	public void setStorage(List<String> storage) {
		this.storage = storage;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "MobileAndLaptops [os=" + os + ", cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", battery="
				+ battery + ", camera=" + camera + "]";
	}
	
}
