package com.aurionpro.behavourial.observer.model;

public class WhatsAppNotifier implements INotifier {

	@Override
	public String notification(Account account) {
		String message = String.format("Account %d: Balance updated to %.2f", account.getAccountNumber(),
				account.getBalance());
		System.out.println("Whatsapp notification sent: " + message);
		return message;
	}

}
