package com.shoplify.service;

import java.util.Random;

import com.shoplify.util.InputHandler;

public class PaymentServiceImpl implements PaymentService{
	
	private void otp(String mNumber) {
		int otp = 0;
		Random r = new Random();
		for(int i=0;i<6;i++) {
			otp = otp*10 + r.nextInt(10);
		}
		
		InputHandler sc = new InputHandler();
		System.out.println("Otp is sent on your mobile Number ending with "+ mNumber.substring(7));
		System.out.println(otp);
		System.out.print("Enter Otp: ");
		int userEnteredOtp = sc.nextInt();
		if(userEnteredOtp!=otp) {
			System.err.println("Wrong otp");
			otp(mNumber);
		}else {
			System.out.println("Payment Successfull");
			return;
		}
	}
	public void paymentOptions(double amount) {
		System.out.println("Total Bill: "+amount);
		System.out.println("Enter 1 for UPI PAYMENT");
		System.out.println("Enter 2 for DEBIT CARD PAYMENT");
		System.out.println("Enter 3 for NET BANKING PAYMENT");
		
		InputHandler sc = new InputHandler();
		int option = sc.nextInt();
		switch(option) {
		case 1:
			upi();
			break;
		case 2:
			debit();
			break;
		case 3:
			netBanking();
			break;
		default:
			System.err.println("You've choosed wrong option Please choose correct payment option");
			paymentOptions(amount);
			break;
		}
	}
	
	public void upi() {		
		InputHandler sc = new InputHandler();
		System.out.print("Enter you resistered UPI Mobile Number: ");
		String mNumber = sc.nextLine();
		if(mNumber.length()!=10 || mNumber.charAt(0)==0) {
			upi();
			return;
		}
		otp(mNumber);
	}
	
	public void debit() {
		InputHandler sc = new InputHandler();
		System.out.print("Enter 16 digit Card Number: ");
		String cardNo = sc.nextLine();
		System.out.println("Enter CVV: ");
		String cvv = sc.nextLine();
		if(cardNo.length()!=16||cvv.length()!=3) {
			System.err.println("Enter correct info");
			debit();
			return;
		}
		otp("9695339121");
	}
	
	public void netBanking() {
		
	}
	
	
}
