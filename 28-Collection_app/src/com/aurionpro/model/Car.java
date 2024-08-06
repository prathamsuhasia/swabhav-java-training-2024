package com.aurionpro.model;

public class Car {
private int carID;
private String companyName;
private double price ; 
private double mileage;

public Car(int carID, String companyName, double price, double mileage) {
	super();
	this.carID = carID;
	this.companyName = companyName;
	this.price = price;
	this.mileage = mileage;
}
public int getCarID() {
	return carID;
}
public void setCarID(int carID) {
	this.carID = carID;
}
public String getCompanyName() {
	return companyName;
}
@Override
public String toString() {
	return "Car [carID=" + carID + ", companyName=" + companyName + ", price=" + price + ", mileage=" + mileage + "]";
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getMileage() {
	return mileage;
}
public void setMileage(double mileage) {
	this.mileage = mileage;
}
}
