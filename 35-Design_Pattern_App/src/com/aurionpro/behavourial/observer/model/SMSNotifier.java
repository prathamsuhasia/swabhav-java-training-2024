package com.aurionpro.behavourial.observer.model;

public class SMSNotifier implements INotifier {

	@Override
	public String notification(Account account) {
		String message = String.format("Account %d: Balance updated to %.2f", account.getAccountNumber(),
				account.getBalance());
		System.out.println("SMS notification sent: " + message);
		return message;
	}

}
