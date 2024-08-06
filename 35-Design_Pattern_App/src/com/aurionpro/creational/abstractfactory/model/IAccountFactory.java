package com.aurionpro.creational.abstractfactory.model;

public interface IAccountFactory {
	
	

	public IAccount createAccount(int accountNumber, String name, double balance);
	

}
