package com.aurionpro.model;

public class StudentModel {
	private int rollNummber;
	private String name;
	private int age;
	private  double percentage;

	public int getRollNumber() {
		return rollNummber;
	}
	public void setRollNumber(int rn) {
		rollNummber = rn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage (double p) {
		percentage  = p;
	}
	
	public char studentGrading(){
		if(percentage>=75) {
			return 'A';
		}
		else if (percentage >= 60 && percentage < 75) {
			return 'B';
		}
		else if (percentage >= 50 && percentage < 60) {
			return 'C';
		}
		else if (percentage >= 40 && percentage < 50) {
			return 'D';
		}
		else {
			return 'F';
			
		}
	}
	
	
}
