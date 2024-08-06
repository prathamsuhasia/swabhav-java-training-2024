package com.aurionpro.structural.facade.model;

public class Projector {
	private boolean projectorOnOff;
	private String source;
	
	public boolean on() {
		projectorOnOff = true;
		return projectorOnOff;
		
	}
	public boolean off() {
		projectorOnOff = false;
		return projectorOnOff;
		
	}
	public String setSource(String source) {
		this.source =source;
		return this.source;
		
		
	}

}
