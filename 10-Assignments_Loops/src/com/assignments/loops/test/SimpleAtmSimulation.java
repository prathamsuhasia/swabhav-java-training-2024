package com.assignments.loops.test;

import java.util.Scanner;

public class SimpleAtmSimulation {
	public static void main(String[] args) {
		int balance = 1000;
		int choice;
		int depositAmount,withdrawAmount;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ATM Menu \n1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Exit");
			System.out.print("Please Choose an option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your current balance is: " + balance + "$");
				break;
			case 2:
				System.out.print("Enter ammount to deposit: ");
				depositAmount = sc.nextInt();
				balance = balance + depositAmount;
				System.out.println("\nYou have deposited " + depositAmount + "$ Your new balance is " + balance + "$");
			break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				withdrawAmount= sc.nextInt();
				if (balance - withdrawAmount <0){
					System.out.println("You dont have enough balance to withdraw this amount");
					
				}
				else {
					balance = balance - withdrawAmount;
					System.out.println("\nYou have withdrawn " + withdrawAmount + "$ Your new balance is " + balance + "$");
				}
			break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				return;
			default:
				System.out.println("Invalid input. Please select correct option");

			}
		}
	}
}
