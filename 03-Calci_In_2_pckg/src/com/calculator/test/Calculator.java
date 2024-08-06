package com.calculator.test;

import java.util.Scanner;

import com.calculator.model.CalciModules;

public class Calculator {

    public static void main(String[] args) {
        int a ,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();


        // Call and store the results of the operations
        int additionResult = CalciModules.addition(a, b);
        int subtractionResult = CalciModules.subtraction(a, b);
        int multiplicationResult = CalciModules.multiplication(a, b);
        int divisionResult = CalciModules.division(a, b);

        // Print the results
        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println("Division result: " + divisionResult);
    }
}
