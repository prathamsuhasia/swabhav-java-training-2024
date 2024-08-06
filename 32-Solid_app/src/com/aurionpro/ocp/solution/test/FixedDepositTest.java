package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliInterest;
import com.aurionpro.ocp.solution.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(123, "pratham", 100000, 10, new DiwaliInterest());
		
		System.out.println("Simple interest is :  " + fixedDeposit.calculateSimpleInterest() + " on amount: " + fixedDeposit.getPrincipal());
				
	}
}