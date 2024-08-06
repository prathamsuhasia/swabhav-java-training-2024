package com.aurionpro.behavourial.state.model;

public class Ordered implements IPacketState {
	Delivered delivered = new Delivered();

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is moving to  delivered state");
		delivered.current(packet);
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is in ordered state ");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		
		System.out.println("packet cannot move to previous state");
	}

}
