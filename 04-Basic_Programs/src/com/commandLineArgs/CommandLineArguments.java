package com.commandLineArgs;

public class CommandLineArguments {
public static void main(String[] args) {
	int number1 = Integer.parseInt(args[0]);
	int number2 = Integer.parseInt(args[1]);
	int sum = number1+number2;
	
	System.out.println("Number1 is " + number1);
	System.out.println("Number2 is " + number2);
	System.out.println("Addition is " + sum);
}
}