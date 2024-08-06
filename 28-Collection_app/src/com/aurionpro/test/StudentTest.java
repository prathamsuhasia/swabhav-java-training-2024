package com.aurionpro.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.aurionpro.model.Student;
public class StudentTest {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Emter number of students");
        int numberOfStudents = scanner.nextInt();
        for(int i = 0; i<numberOfStudents; i++) {
        	System.out.println("Enter name");
        	String name = scanner.next();
        	System.out.println("Enter roll number ");
        	int rollNumber = scanner.nextInt();
        	System.out.println("Enter percentage");
        	double percentage = scanner.nextDouble();
        	 students.add(new Student(name,rollNumber, percentage));
        }
       
        

        // System.out.println(students);
        System.out.println("Using normal for loop");
        for(int i=0; i<students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("Using advance for loop");
        for(Student student: students) {
            System.out.println(student);
        }

        System.out.println("Using iterator");
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

        System.out.println("Using list iterator");
        ListIterator<Student> studentListIterator = students.listIterator();
        while(studentListIterator.hasNext()) {
            System.out.println(studentListIterator.next());
        }
        while(studentListIterator.hasPrevious()) {
            System.out.println(studentListIterator.previous());
        }
        scanner.close();
    }

}
