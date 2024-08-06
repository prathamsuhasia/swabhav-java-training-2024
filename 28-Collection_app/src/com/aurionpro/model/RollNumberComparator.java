package com.aurionpro.model;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Students>{

	@Override
	public int compare(Students student1, Students student2) {

		return student1.getRollNumber() - student2.getRollNumber();
	}

}
