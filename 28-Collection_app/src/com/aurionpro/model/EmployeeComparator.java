package com.aurionpro.model;

import java.util.Comparator;

public class EmployeeComparator {

	public static  class employeeIDComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			
			return employee1.getEmployeeID() - employee2.getEmployeeID();
		}
		
	}
	public static  class nameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return employee1.getName().compareTo(employee2.getName());
		}
		
	}
	public static class SalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			if(employee1.getSalary() > employee2.getSalary()) {
				return 1;
			}
			if(employee1.getSalary() < employee2.getSalary()) {
				return -1;
			}
			return 0;
		}
		
	}
}
