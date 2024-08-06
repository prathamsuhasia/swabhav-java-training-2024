package com.aurionpro.creational.singleton.model;

public class Login {

	private static Login login;

	private Login() {

		System.out.println("Login created");
		// TODO Auto-generated constructor stub
	}

	public void status() {
		System.out.println("Login successfull");
	}

	public static Login getLogin() {
		if (login == null) {
			login = new Login();

		}
		return login;

	}

}
