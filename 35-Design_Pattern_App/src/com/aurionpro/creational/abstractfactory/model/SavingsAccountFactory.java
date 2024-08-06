package com.aurionpro.creational.abstractfactory.model;

public class SavingsAccountFactory implements IAccountFactory{

	

	@Override
	public IAccount createAccount(int accountNumber, String name, double balance) {
		// TODO Auto-generated method stub
		return new SavingsAccount( accountNumber, name,  balance);
	}

}
