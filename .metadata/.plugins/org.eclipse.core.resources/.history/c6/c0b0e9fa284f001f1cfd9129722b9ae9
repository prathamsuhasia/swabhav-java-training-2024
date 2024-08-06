package com.aurionpro.creational.factory.model;

public class CarFactory {

	private Icar icar;
	public Icar makeCar(CarName carName) {
		if(carName.equals(carName.MARUTI))
			icar= new Maruti();
		
		if(carName.equals(carName.TATA))
			icar= new Tata();
		
		if(carName.equals(carName.MAHINDRA))
			icar= new Mahindra();
		
		return icar;
		
	}
}
