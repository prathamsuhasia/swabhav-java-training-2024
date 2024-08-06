package com.aurionpro.structural.decorator.model;

public class PremiumHat implements IHat {
	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 1000;
	}

	@Override
	public String getDescription() {
		return "A premium quality hat.";
	}
}
