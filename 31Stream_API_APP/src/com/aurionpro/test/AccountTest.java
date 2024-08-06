package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> accounts= new ArrayList<Account>();
		
		accounts.add(new Account(20000, "Pratham"));
		accounts.add(new Account(10000, "Suhas"));
		accounts.add(new Account(30000, "Jateen"));
		accounts.add(new Account(40000, "Subodh"));
		accounts.add(new Account(50000, "Yadullah"));
		
		System.out.println("Maximum balance account");
		Optional<Account> maximumBalanceAccount = accounts.stream()
				.max((account1,account2)-> (int) (account1.getBalance()-account2.getBalance()));
		
		System.out.println(maximumBalanceAccount.get());
		
		System.out.println("mnimum balance account");
		Optional<Account> minimumBalanceAccount = accounts.stream()
				.min((account1,account2)-> (int) (account1.getBalance()-account2.getBalance()));
		System.out.println(minimumBalanceAccount.get());
		
		System.out.println("Accounts with name greater than 6 letters");
		List<Account> greaterThanSixName = accounts.stream()
				.filter((account)-> (account.getName().length() <=6))
				.collect(Collectors.toList());
		
		greaterThanSixName.stream()
						  .forEach((account)->System.out.println(account));
		
		
		System.out.println("Total balance of all accounts");
		Optional<Double> totalBalance = accounts.stream()
				.map((account)->account.getBalance())
				.reduce((account1,account2)-> account1+account2);
		System.out.println(totalBalance);
		
	}
}
