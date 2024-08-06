package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;
import com.aurionpro.structural.decorator.model.OilChange;
import com.aurionpro.structural.decorator.model.WheelAlign;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService carService =  new CarInspection();
		System.out.println(carService.getCost());
		OilChange oilChange = new OilChange(carService);
		System.out.println(oilChange.getCost());
		WheelAlign wheelAlign = new WheelAlign(oilChange);
		System.out.println(wheelAlign.getCost());
	}
}
