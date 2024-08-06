package com.aurionpro.model;

import java.util.Comparator;

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
