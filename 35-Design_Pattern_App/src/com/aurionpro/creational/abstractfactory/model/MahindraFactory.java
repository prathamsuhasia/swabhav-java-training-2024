package com.aurionpro.creational.abstractfactory.model;

public class MahindraFactory implements  ICarFactory {

	@Override
	public Icar make() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}

}
