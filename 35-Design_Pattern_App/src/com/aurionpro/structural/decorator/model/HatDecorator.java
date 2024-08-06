package com.aurionpro.structural.decorator.model;

public abstract class HatDecorator implements IHat {
    protected IHat hat;

    public HatDecorator(IHat hat) {
        this.hat = hat;
    }


}

