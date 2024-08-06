package com.aurionpro.model;

public class Student extends PersonModel {
	private int rollNumber;
	private String name;
	public int getRollNumber() {
		return rollNumber;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", Age=" + getAge() + ", Address="
				+ getAddress()  + "]";
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
	

}
