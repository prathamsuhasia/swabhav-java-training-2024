package com.aurionpro.structural.facade.model;

public class MovieFacade implements IDVDPlayer,IProjector, ISoundSystem {
	private DVDPlayer dvdplayer =  new DVDPlayer();
	private Projector projector  =  new Projector();
	private SoundSystem soundSystem = new SoundSystem();
	
	private boolean projectorOnOff;
	private boolean soundSystemstartStop;
	private int volume;

	
	
	public void startMovie() {
		
		dvdplayer.on();
		projector.on();
		projector.setSource("USB");
		soundSystem.start();
		System.out.println("Movie started");
		
	}
	
	public void stopMovie() {
		
		dvdplayer.off();
		projector.off();
		projector.setSource("Ejected");
		soundSystem.stop();
		System.out.println("Movie stopped");
		
	}

	@Override
	public boolean soudSystemStart() {
		soundSystemstartStop = true;
		return soundSystemstartStop;
	}

	@Override
	public boolean soundSystemStop() {
		soundSystemstartStop = false;
		return soundSystemstartStop;
	}

	@Override
	public int volumeUP() {
		volume++;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume--;
		return volume;
	}

	@Override
	public boolean projectorOn() {
		projectorOnOff = true;
		return projectorOnOff;
	}

	@Override
	public boolean projectorOff() {
		boolean projectorOnOff = true;
		return projectorOnOff;
	}

	@Override
	public void setInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean dvdPlayerOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dvdPlayerOff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dvdPlayerStart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dvdPlayerStop() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
