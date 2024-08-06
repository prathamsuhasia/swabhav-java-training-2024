package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {

	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		IAccount account = accountFactory.getCurrentAccount(1, "Pratham", 100000);
		
		System.out.println("amount after debit is " + account.debit(1000));
		
		System.out.println("amount after credit  is " + account.credit(1000));
		
		
		
		

	}

}
