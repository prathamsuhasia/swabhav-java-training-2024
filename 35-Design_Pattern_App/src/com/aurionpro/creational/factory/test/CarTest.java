package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarName;
import com.aurionpro.creational.factory.model.Icar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		
		Icar car = carFactory.makeCar(CarName.TATA);
		car.start();
		car.stop();
		
		
	}

}
