package com.aurionpro.creational.builder.test;

import com.aurionpro.creational.builder.model.Phone;
import com.aurionpro.creational.builder.model.PhoneBuilder;

public class Shop {
	
	public static void main(String[] args) {
		Phone phone  = new PhoneBuilder().setOperatingSystem("Android").setRam(8).setScreenSize(5.5).getPhone();
		
		System.out.println(phone);
	}

}
