package com.aurionpro.structural.decorator.model;

public  abstract class  CarServiceDecorator implements ICarService{
public ICarService carObject;

public CarServiceDecorator(ICarService carObject) {
	super();
	this.carObject = carObject;
}

}
