package com.aurionpro.model;

public class FourWheeler extends Vehicle {
private double mileage;

public double getMileage() {
	return mileage;
}
public FourWheeler(double mileage,String companyName) {
	super(companyName);
	this.mileage =mileage;
}
public void setMileage(double mileage) {
	this.mileage = mileage;
}
}
