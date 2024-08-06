package com.aurionpro.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Employee;
import com.aurionpro.model.EmployeeComparator;


public class EmployeeTest {
	public static void main(String[] args) {
		
		
		List<Employee> employees =  new ArrayList();
		Scanner scanner =  new Scanner(System.in);
        System.out.println("Emter number of Employee");
        int numberOfEmployees = scanner.nextInt();
        for(int i = 0; i<numberOfEmployees; i++) {
        	System.out.println("Enter name");
        	String name = scanner.next();
        	System.out.println("Enter employee Id ");
        	int employeeID = scanner.nextInt();
        	System.out.println("Enter Salary");
        	double salary = scanner.nextDouble();
        	 employees.add(new Employee(employeeID,name, salary));
        }
        
        Collections.sort(employees, new EmployeeComparator.SalaryComparator());
        
        for(Employee employee: employees) {
        	System.out.println(employee.getEmployeeID()+ " - " + employee.getName() + " - " + employee.getSalary());
        }
        
        
        
	}
}
