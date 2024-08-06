package com.aurionpro.model;

import java.util.Comparator;

public  class StudentComparator {

	public static class RollNumberComparator implements Comparator<Students>{

		@Override
		public int compare(Students student1, Students student2) {

			return student1.getRollNumber() - student2.getRollNumber();
		}

	}
	
	public class PercentageComparator implements Comparator<Students>{

		@Override
		public int compare(Students student1, Students student2) {
			if (student1.getPercentage() > student2.getPercentage()){
				return 1;
			}
		
			if (student1.getPercentage() < student2.getPercentage()){
				return -1;
			}
			return 0;
		}

	}
	
	public class NameComparator implements Comparator<Students> {

		@Override
		public int compare(Students student1, Students student2) {

			return student1.getName().compareTo(student2.getName());
		}
		

	}



}
