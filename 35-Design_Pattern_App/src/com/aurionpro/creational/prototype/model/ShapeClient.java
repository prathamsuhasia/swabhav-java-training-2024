package com.aurionpro.creational.prototype.model;


public class ShapeClient {
	private IShape shapePrototype;


	public ShapeClient(IShape shapePrototype) {
		this.shapePrototype = shapePrototype;
	}

	public IShape createShape() {
		return shapePrototype.clone();
	}
}
