package com.aurionpro.structure.adapter.model;

public class Hat {
	private String shortName;
	private String longName;
	private double tax;
	private double price;
	
	public Hat(String shortName, String longName, double tax, double price) {
		super();
		this.shortName = shortName;
		this.longName = longName;
		this.tax = tax;
		this.price = price;
	}
	
	public String getShortName() {
		return shortName;
	}
	public String getLongName() {
		return longName;
	}
	public double getTax() {
		return tax;
	}
	public double getPrice() {
		return price;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
