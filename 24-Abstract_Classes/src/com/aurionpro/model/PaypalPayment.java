package com.aurionpro.model;

public class PaypalPayment extends Payment{

	@Override
	public void paybill() {
		// TODO Auto-generated method stub
		System.out.println("Payed by paypal");
		
	}

	@Override
	public void redeem() {
		// TODO Auto-generated method stub
		System.out.println("redeemed through paypal");
	}

}
