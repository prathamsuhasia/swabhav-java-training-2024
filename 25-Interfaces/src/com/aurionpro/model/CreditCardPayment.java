package com.aurionpro.model;

public class CreditCardPayment implements Payment {

	@Override
	public void paybill() {
	System.out.println("payed by credit card");
		
	}

	@Override
	public void redeem() {
		// TODO Auto-generated method stub
		System.out.println("redeemed  by credit card  ");
		
	}
	

}
