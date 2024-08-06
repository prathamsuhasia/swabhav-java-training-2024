package com.control.structure.test;

import java.util.Scanner;

public class CurrencyDenominationApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter withdrawal amount:");
		int amount = scanner.nextInt();

		if (amount > 50000) {
			System.out.println("Amount exceeds withdrawal limit of 50000");
		} else if (amount % 100 != 0) {
			System.out.println("Amount should be in multiples of 100");
		} else {
			int remainingAmount = amount;

			int count2000 = remainingAmount / 2000;
			remainingAmount %= 2000;

			int count500 = remainingAmount / 500;
			remainingAmount %= 500;

			int count200 = remainingAmount / 200;
			remainingAmount %= 200;

			int count100 = remainingAmount / 100;
			remainingAmount %= 100;

			if (count2000 > 0) {
				System.out.println("Two Thousand : " + count2000);
			}
			if (count500 > 0) {
				System.out.println("Five Hundred : " + count500);
			}
			if (count200 > 0) {
				System.out.println("Two Hundred : " + count200);
			}
			if (count100 > 0) {
				System.out.println("Hundred : " + count100);
			}
		}

	}
}
