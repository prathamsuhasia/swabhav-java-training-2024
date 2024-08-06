package com.control.structure.test;

import java.util.Scanner;

public class TreasureHunt {
	public static void main(String[] args) {

		System.out.println("Welcome to Treasure Island your mission is to find the treasure ");

		Scanner sc = new Scanner(System.in);
		int direction;
		System.out.println("Choose the direction: \n1. Left \n2. Right");
		direction = sc.nextInt();

		if (direction == 1) {
			System.out.println("\nYou have cleared the first obstacle successfully congratulations!!");
			System.out.println("\nNow choose if you want to swim or wait here: \n1. Swim \n2. Wait  ");
			int swimWait = sc.nextInt();
			if (swimWait == 2) {
				System.out.println("\nYou have cleared the second obstacle successfully congratulations!!");

				System.out.println("\n Which Door will you choose: \n1. Red \n2. Blue \n3. yellow");
				int door = sc.nextInt();

				switch (door) {
				case 1:
					System.out.println("You got burnedby fire game over");
					break;
				case 2:
					System.out.println("Eaten by beasts game over");
					break;
				case 3:
					System.out.println("You won the game Congratulations!!");
					break;
				default:
					System.out.println("Game over");
				}

			} else {
				System.out.println("You got attacked by trout game over");
			}
		} else {
			System.out.println("You Fell you into the hole game over");
		}
	}
}
