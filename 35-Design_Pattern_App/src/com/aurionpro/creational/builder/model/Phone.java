package com.aurionpro.creational.builder.model;

public class Phone {
	
	private String operatingSystem;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String operatingSystem, int ram, String processor, double screenSize, int battery) {
		super();
		this.operatingSystem = operatingSystem;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [operatingSystem=" + operatingSystem + ", ram=" + ram + ", Processor=" + processor
				+ ", ScreenSize=" + screenSize + ", battery=" + battery + "]";
	}



}
