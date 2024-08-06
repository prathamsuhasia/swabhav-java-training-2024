package com.conditional.statements;

import java.util.Scanner;

public class WaterbillCalculator {
	public static void main(String[] args) {
		
		int unitsConsumed;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unitsConsumed consumed");
		unitsConsumed = sc.nextInt();
		
		int charge;
		int waterBill;
		final int meterCharge = 75;
		
		if (unitsConsumed<=100) {
			charge=unitsConsumed*5;
		}
		else {
			if (unitsConsumed<= 250) {
				charge  = unitsConsumed *10;
			
			}
			else {
				charge = unitsConsumed * 20;
			}
		}
		waterBill =charge+meterCharge;
		System.out.println("Total water bill is " + waterBill);
	}
}
