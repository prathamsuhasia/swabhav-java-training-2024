package com.aurionpro.model;

public class Student {
private  String name;
private int rollNumber;
private double percentage;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public Student(String name, int rollNumber, double percentage) {
	super();
	this.name = name;
	this.rollNumber = rollNumber;
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollNumber=" + rollNumber + ", percentage=" + percentage + "]";
}

}
