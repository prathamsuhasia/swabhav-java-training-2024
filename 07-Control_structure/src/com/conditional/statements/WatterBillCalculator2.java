package com.conditional.statements;

import java.util.Scanner;

public class WatterBillCalculator2 {
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
				charge  = (unitsConsumed-100) *10;
				charge += 100*5;
			}
			else {
				charge = (unitsConsumed-250) * 20;
				charge += 100*5;
				charge += 150*10;
				
			}
		}
		waterBill =charge+meterCharge;
		System.out.println("Total water bill is " + waterBill);
	}

}
