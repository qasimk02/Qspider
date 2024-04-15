package com.shoplify.model;

public class PaymentDetails {
	
private String paymentMethod;
	
	private String status;
	
	private String paymentLinkId;
	
	private String paymentRefereceId;
	
	private String paymentId;

	public PaymentDetails(String paymentMethod, String status, String paymentLinkId, String paymentRefereceId,
			String paymentId) {
		super();
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.paymentLinkId = paymentLinkId;
		this.paymentRefereceId = paymentRefereceId;
		this.paymentId = paymentId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentLinkId() {
		return paymentLinkId;
	}

	public void setPaymentLinkId(String paymentLinkId) {
		this.paymentLinkId = paymentLinkId;
	}

	public String getPaymentRefereceId() {
		return paymentRefereceId;
	}

	public void setPaymentRefereceId(String paymentRefereceId) {
		this.paymentRefereceId = paymentRefereceId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymentMethod=" + paymentMethod + ", status=" + status + ", paymentLinkId="
				+ paymentLinkId + ", paymentRefereceId=" + paymentRefereceId + ", paymentId=" + paymentId + "]";
	}

	
	
}
