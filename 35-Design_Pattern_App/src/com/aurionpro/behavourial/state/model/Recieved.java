package com.aurionpro.behavourial.state.model;

public class Recieved implements IPacketState{
	private Delivered delivered  = new Delivered();
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is already in recieved state");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is in recieved state ");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is moving to delivered state");
		delivered.current(packet);
		
	}
	

}
