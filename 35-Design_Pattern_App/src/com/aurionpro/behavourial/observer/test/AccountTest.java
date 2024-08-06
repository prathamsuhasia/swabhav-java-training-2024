package com.aurionpro.behavourial.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.behavourial.observer.model.Account;
import com.aurionpro.behavourial.observer.model.EmailNotifier;
import com.aurionpro.behavourial.observer.model.INotifier;
import com.aurionpro.behavourial.observer.model.SMSNotifier;
import com.aurionpro.behavourial.observer.model.WhatsAppNotifier;

public class AccountTest {
	public static void main(String[] args) {
		
		List<INotifier> notifiers =  new ArrayList<INotifier>();
		
		char choice;
		Scanner scanner =  new Scanner(System.in);
		Account account = new Account(1, "Pratham", 10000); 
		
		System.out.println("Do you want sms notification");
		 choice = scanner.next().charAt(0);
		if (choice== 'y')
			account.registerNotifier(new SMSNotifier());
		
		System.out.println("Do you want email notification");
		choice = scanner.next().charAt(0);
		if (choice== 'y')
			account.registerNotifier(new EmailNotifier());
		
		System.out.println("Do you want whasapp notification");
		choice = scanner.next().charAt(0);
		if (choice== 'y')	
			account.registerNotifier(new WhatsAppNotifier());
		
		account.deposit(100);
		
		
	}

}
