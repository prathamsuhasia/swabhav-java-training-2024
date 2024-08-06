package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.setName("pratham");
		student1.setAge(21);
		student1.setAddress("kurla");
		student1.setRollNumber(33);
		
		System.out.println(student1);
		
	}
}
