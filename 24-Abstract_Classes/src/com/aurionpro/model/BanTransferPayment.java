package com.aurionpro.model;

public class BanTransferPayment extends Payment{

	@Override
	public void paybill() {
		// TODO Auto-generated method stub
		System.out.println("Payed through bank transfer");
		
	}

	@Override
	public void redeem() {
		// TODO Auto-generated method stub
		System.out.println("redeemed through bank transfer");
		
	}

}
