package com.aurionpro.structural.decorator.model;

public class StandardHat implements IHat {
	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return "A standard hat.";
	}
}