package com.aurionpro.behavourial.strategy.test;

import com.aurionpro.behavourial.strategy.model.AddOperation;
import com.aurionpro.behavourial.strategy.model.OperationStrategy;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy operation = new OperationStrategy(new AddOperation());
	double addition  = operation.doOperation(10, 20);
	System.out.println(addition);
	}
}
