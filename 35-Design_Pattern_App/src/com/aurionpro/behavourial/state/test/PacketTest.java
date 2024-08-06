package com.aurionpro.behavourial.state.test;

import com.aurionpro.behavourial.state.model.Ordered;
import com.aurionpro.behavourial.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet  = new Packet(new Ordered());
		packet.getCurrentState();
		packet.goToNextState();
		packet.getCurrentState();
	}

}
