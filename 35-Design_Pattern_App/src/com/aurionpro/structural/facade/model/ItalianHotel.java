package com.aurionpro.structural.facade.model;

public class ItalianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		IMenu imenu = new ItalianMenu();
		return imenu;
	}

}
