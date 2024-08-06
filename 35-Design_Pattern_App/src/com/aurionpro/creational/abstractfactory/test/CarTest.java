package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.ICarFactory;
import com.aurionpro.creational.abstractfactory.model.Icar;
import com.aurionpro.creational.abstractfactory.model.Mahindra;
import com.aurionpro.creational.abstractfactory.model.MarutiFactory;

public class CarTest {
	public static void main(String[] args) {
		
		ICarFactory marutiFactory = new MarutiFactory();
		Icar maruti =  marutiFactory.make();
		
		maruti.start();
		
	}

}
