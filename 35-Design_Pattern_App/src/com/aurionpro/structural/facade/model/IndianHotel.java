package com.aurionpro.structural.facade.model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		IMenu imenu = new IndianMenu();
		return imenu;
	}
	

}
