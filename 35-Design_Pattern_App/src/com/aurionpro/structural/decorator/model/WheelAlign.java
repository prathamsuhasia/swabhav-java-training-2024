package com.aurionpro.structural.decorator.model;

public class WheelAlign extends CarServiceDecorator{

	


	public WheelAlign(ICarService carObject) {
		super(carObject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1500+carObject.getCost();
	}

}
