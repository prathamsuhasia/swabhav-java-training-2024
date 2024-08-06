package com.aurionpro.structure.adapter.model;

public class Biscuit implements IItems{

	private String name;
	private double price;
	
	
	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
		
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
