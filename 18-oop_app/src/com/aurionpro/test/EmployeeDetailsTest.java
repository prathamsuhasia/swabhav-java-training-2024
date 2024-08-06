package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.EmployeeDetailsModel;

public class EmployeeDetailsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDetailsModel empd = new EmployeeDetailsModel();

		System.out.println("For Employee 1");

		System.out.println("Enter Employee  ID for first employee:");
		empd.setEmployeeID(sc.nextInt());
		System.out.println("Enter Employee Name for first employee:");
		empd.setEmployeeName(sc.next());
		System.out.println("Enter Employee Salary for first employee:");
		empd.setEmployeeSalary(sc.nextDouble());

		System.out.println("Employee ID: " + empd.getEmployeeID());
		System.out.println("Employee Name: " + empd.getEmployeeName());
		System.out.println("Employee Salary: " + empd.getEmployeeSalary());

		EmployeeDetailsModel empd2 = new EmployeeDetailsModel();
		System.out.println("For Employee 2");
		System.out.println("Enter Employee  ID for Second employee:");
		empd2.setEmployeeID(sc.nextInt());
		System.out.println("Enter Employee Name for Second employee:");
		empd2.setEmployeeName(sc.next());
		System.out.println("Enter Employee Salaryfor Second employee:");
		empd2.setEmployeeSalary(sc.nextDouble());

		System.out.println("Employee ID: " + empd2.getEmployeeID());
		System.out.println("Employee Name: " + empd2.getEmployeeName());
		System.out.println("Employee Salary: " + empd2.getEmployeeSalary());

	}
}
