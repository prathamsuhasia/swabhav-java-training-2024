package com.aurionpro.test;

public class ExceptionTest {
	public static void main(String[] args) {

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double result = number1 / number2;
			System.out.println("Division is:  " + result);
			
		} catch (ArithmeticException exception) {
			
			System.out.println("cannot divide by zero");

		}
		catch (ArrayIndexOutOfBoundsException exception) {
		
			System.out.println("Please provide 2 numbers");
		} 
		catch (NumberFormatException exception) {
			
			System.out.println("Only integer are allowed");
		} 
		catch (Exception exception) {
			
			System.out.println("Something went wrong  " + exception);
		}
		finally  {
			System.out.println("Inside finally.  closing activities");
		}
		System.out.println("Exiting main....");
	}
}
