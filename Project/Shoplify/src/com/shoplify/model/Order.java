package com.shoplify.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	
	User user;
	List<OrderItem> orderItems;
	double totalAmt;
	double shippingCharge;
	String status;
	String shippingAddress;
	String phoneNumber;
	LocalDateTime orderedAt;
	
	public Order(User user, List<OrderItem> orderItems, double totalAmt, double shippingCharge, String status,
			String shippingAddress, String phoneNumber) {
		super();
		this.user = user;
		this.orderItems = orderItems;
		this.totalAmt = totalAmt;
		this.shippingCharge = shippingCharge;
		this.status = status;
		this.shippingAddress = shippingAddress;
		this.phoneNumber = phoneNumber;
		this.orderedAt = LocalDateTime.now();
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	public double getTotalAmt() {
		return totalAmt;
	}
	
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	
	public double getShippingCharge() {
		return shippingCharge;
	}
	
	public void setShippingCharge(double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getShippingAddress() {
		return shippingAddress;
	}
	
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public LocalDateTime getOrderedAt() {
		return orderedAt;
	}
	
	public void setOrderedAt(LocalDateTime orderedAt) {
		this.orderedAt = orderedAt;
	}
	
	@Override
	public String toString() {
		return "Order [user=" + user + ", orderItems=" + orderItems + ", totalAmt=" + totalAmt + ", shippingCharge="
				+ shippingCharge + ", status=" + status + ", shippingAddress=" + shippingAddress + ", phoneNumber="
				+ phoneNumber + ", orderedAt=" + orderedAt + "]";
	}	
	
}
