package com.aurionpro.structural.facade.model;

public class SoundSystem {
	private int volume =0 ;
	private boolean soundSystemstartStop;
	

	public boolean start() {
		soundSystemstartStop = true;
		return soundSystemstartStop;
		
	}
	public boolean stop() {
		soundSystemstartStop = false;
		return soundSystemstartStop;
		
	}
	
	public int volumeUP() {
		volume++;
		return volume;
		
	}
	public int volumeDown() {
		volume--;
		return volume;
		
	}

}
