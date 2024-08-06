package com.aurionpro.ocp.violation.test;

import com.aurionpro.ocp.violation.model.FestivalType;
import com.aurionpro.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(123, "pratham", 100000, 10, FestivalType.Diwali);
		
		System.out.println("Simple interest is :  " + fixedDeposit.calculateSimpleInterest() + " on amount: " + fixedDeposit.getPrincipal());
				
	}
}
