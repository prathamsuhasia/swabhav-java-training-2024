package com.aurionpro.structure.adapter.model;

public class HatAdapter implements IItems{
	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getShortName().concat(hat.getLongName());
		
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice()+hat.getTax();
	}
	
	

}
