package com.aurionpro.structural.facade.model;

public class DVDPlayer {
	private boolean onOff;
	private boolean startStop;
	
	public boolean on() {
		onOff = true;
		return onOff;
		
	}
	public boolean off() {
		onOff = false;
		return onOff;
		
	}
	public boolean start() {
		startStop = true;
		return startStop;
		
	}
	public boolean stop() {
		startStop = false;
		return startStop;
		
	}

}