package com.aurionpro.behavourial.strategy.model;

public class OperationStrategy {
	private IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	public double doOperation(int number1, int number2) {
		return operation.doOperation(number1, number2);
		
	}


}