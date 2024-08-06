package com.aurionpro.model;

public class Car extends FourWheeler {
private double price;

public double getPrice() {
	return price;
}
public Car(double price, double mileage , String companyName) {
	super(mileage,companyName);
	this.price =price;
}
public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Car [price=" + price + ", Mileage=" + getMileage() + ", CompanyName=" + getCompanyName() + "]";
}
}
