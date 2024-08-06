package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.Accountant;
import com.aurionpro.structural.composite.model.BankManager;
import com.aurionpro.structural.composite.model.Cashier;
import com.aurionpro.structural.composite.model.IEmployee;

public class CompositePatternTest {
	public static void main(String args[]) {
		IEmployee emp1 = new Cashier(101, "Sohan Kumar", 20000.0);
		IEmployee emp2 = new Cashier(102, "Mohan Kumar", 25000.0);
		IEmployee emp3 = new Accountant(103, "Seema Mahiwal", 30000.0);
		IEmployee manager1 = new BankManager(100, "Ashwani Rajput", 100000.0);

		manager1.add(emp1);
		manager1.add(emp2);
		manager1.add(emp3);
		manager1.print();
		
	}
}
