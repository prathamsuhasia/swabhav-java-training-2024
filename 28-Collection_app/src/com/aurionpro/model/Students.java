package com.aurionpro.model;

public class Students {
private int rollNumber ;
private String name;
private double percentage;

public Students(int rollNumber, String name, double percentage) {
	super();
	this.rollNumber = rollNumber;
	this.name = name;
	this.percentage = percentage;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}

}
