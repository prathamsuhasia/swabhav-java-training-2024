package com.aurionpro.behavourial.state.model;

public class Delivered implements IPacketState {
	Delivered delivered = new Delivered();
	Recieved recieved =  new Recieved();
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is moving to recieved state");
		recieved.current(packet);
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is moving to ordered  state");
		delivered.current(packet);
	}

}
