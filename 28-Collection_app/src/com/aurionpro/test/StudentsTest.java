package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.NameComparator;
import com.aurionpro.model.RollNumberComparator;
import com.aurionpro.model.StudentComparator;
import com.aurionpro.model.Students;

public class StudentsTest {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        List<Students> students = new ArrayList<>();
        
        students.add(new Students(2,"Pratham" , 75));
        students.add(new Students(1,"Suhas" , 85));
        students.add(new Students(4,"Jateen" , 95));
        students.add(new Students(3,"Subodh" , 85));
        System.out.println("Before sorting");
        
        printStudents( students);
        
        System.out.println("After sorting");
        Collections.sort(students, new StudentComparator.RollNumberComparator() );
       
        printStudents( students);
        
//        Collections.sort(students, new NameComparator() );
//        printStudents( students);
		
	}
	private static void printStudents(List<Students> students) {
		for (Students student: students) {
			System.out.println(student.getRollNumber() + " - " + student.getName() + " - " + student.getPercentage());
			
		}
	}
}
