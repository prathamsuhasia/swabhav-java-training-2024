package com.aurionpro.model;

public class Box {
	private int height;
	private int depth;
	private int width;
	
	
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height =height;
		this.depth = depth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	
	public int calculateArea() {
		return height * width * depth;
	}
}
