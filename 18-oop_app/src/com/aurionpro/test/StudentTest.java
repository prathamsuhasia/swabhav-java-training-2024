package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.StudentModel;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StudentModel student1 = new StudentModel();

		System.out.println("Enter Rollnumber for student1: ");
		student1.setRollNumber(sc.nextInt());
		System.out.println("Enter Name for student1 : ");
		student1.setName(sc.next());
		System.out.println("Enter Age for student1: ");
		student1.setAge(sc.nextInt());
		System.out.println("Enter percentage for student1: ");
		student1.setPercentage(sc.nextDouble());

		System.out.println("Details of student1");
		System.out.println("RollNumber: " + student1.getRollNumber());
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Percentage: " + student1.getPercentage());
		System.out.println("Grade is: " + student1.studentGrading());

		StudentModel student2 = new StudentModel();

		System.out.println("Enter Rollnumber for student2: ");
		student2.setRollNumber(sc.nextInt());
		System.out.println("Enter Name for student2 : ");
		student2.setName(sc.next());
		System.out.println("Enter Age for student2: ");
		student2.setAge(sc.nextInt());
		System.out.println("Enter percentage for student2: ");
		student2.setPercentage(sc.nextDouble());

		System.out.println("Details of student2");
		System.out.println("RollNumber: " + student2.getRollNumber());
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Percentage: " + student2.getPercentage());
		System.out.println("Grade is: " + student2.studentGrading());

	}
}
