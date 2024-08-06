package com.aurionpro.creational.abstractfactory.model;

public class CurrentAccountFactory  implements IAccountFactory{

	@Override
	public IAccount createAccount(int accountNumber,String name, double balance) {
		// TODO Auto-generated method stub
		return new CurrentAccount(accountNumber, name, balance);
	}

}
