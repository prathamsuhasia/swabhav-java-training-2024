package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operations;
	
	@BeforeEach
	public void init() {
		operations = new Operations();
	}
	
	@AfterEach
	public void status() {
		System.out.println("Test Finished!!!");
	}
	@Test
	void testAddittion() {

		assertEquals(30, operations.addittion(10, 20), "this method should perform addition");
	}

	@Test
	void testSubtraction() {

		assertEquals(30, operations.subtraction(40, 10), "this method should perform subtraction");
	}

	@Test
	void testMultiplication() {

		assertEquals(30, operations.multiplication(10, 3), "this method should perform multiplication");
	}

	@Test
	void testDivision() {

		assertEquals(2, operations.division(10, 5), "this method should perform division");
		
		assertThrows(ArithmeticException.class,()-> operations.division(10, 0));
	}
	
	@Test
	void testsquareOfArrayElemenrs() {
		int squares[] = {25,36,64};
		int numbers[] = {5,6,8};
		
		assertArrayEquals(squares, operations.squareOfArrayElemenrs(numbers));
	}
	
	
	@Test 
	void testISEven() {
		assertTrue(operations.isEven(6));
		assertFalse(operations.isEven(7));
		
	}
	
	
}
