package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator {
    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return hat.getName() + ", Golden";
    }

    @Override
    public double getPrice() {
        // Adding $15 for the golden feature
        return hat.getPrice() + 300;
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " with a golden finish.";
    }
}


