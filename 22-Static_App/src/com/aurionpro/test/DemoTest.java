package com.aurionpro.test;

import com.aurionpro.model.DemoModel;

public class DemoTest {
	// static is used  so java runtime can call the main class without creating object of DemoTest
	public static void main(String[] args) {
		DemoModel demo1 = new DemoModel();
		demo1.display();
		demo1.increment();
		demo1.display();

		DemoModel demo2 = new DemoModel();
		demo2.display();
		demo2.increment();
		demo2.display();

		DemoModel demo3 = new DemoModel();
		demo3.display();
		demo3.increment();
		demo3.display();
	}

	// static blocks are executed when a class is loaded
	// if static is removed from the below block it will never execute DemoTest object is never created 
	static {
		System.out.println("jaaaaaadooooooo");
	}
}
