package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.Login;

public class LoginTest {
	public static void main(String[] args) {
		Login login = Login.getLogin();
		System.out.println(login.hashCode());
		
		Login login2 = login.getLogin();
		System.out.println(login2.hashCode());
		login.status();
	}
}
