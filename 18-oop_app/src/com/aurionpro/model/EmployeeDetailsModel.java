package com.aurionpro.model;

public class EmployeeDetailsModel {
	private int employeeID;
	private String name;
	private double salary;
	
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int empid){
		employeeID= empid;
	}
	public String getEmployeeName() {
		return name;
		
	}
	public void setEmployeeName(String n) {
		name =n;
	}
	
	public double getEmployeeSalary() {
		return salary;
	}
	public void setEmployeeSalary(double sal){
		salary= sal;
	}
	
	
}
