package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.Circle;
import com.aurionpro.creational.prototype.model.IShape;
import com.aurionpro.creational.prototype.model.ShapeClient;

public class PrototypeTest {
	
	public static void main(String[] args) {
		
		
        IShape circlePrototype = new Circle("red");
 

        ShapeClient client = new ShapeClient(circlePrototype);
 
        IShape redCircle = client.createShape();
 
        redCircle.draw();
    }

}
