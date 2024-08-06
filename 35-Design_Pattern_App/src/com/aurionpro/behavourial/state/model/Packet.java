package com.aurionpro.behavourial.state.model;

public class Packet {
	private IPacketState iPacketState;

	public Packet(IPacketState iPacketState) {
		super();
		this.iPacketState = iPacketState;
	}

	public IPacketState getiPacketState() {
		return iPacketState;
	}

	public void setiPacketState(IPacketState iPacketState) {
		this.iPacketState = iPacketState;
	}

	public void goToNextState() {
		iPacketState.next(this);

	}

	public void goToPreviousState() {
		iPacketState.previous(this);

	}

	public void getCurrentState() {
		iPacketState.current(this);

	}

}
