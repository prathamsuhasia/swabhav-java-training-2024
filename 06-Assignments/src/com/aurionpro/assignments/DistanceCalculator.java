package com.aurionpro.assignments;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the x-coordinate of the first point (x1):");
        double x1 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate of the first point (y1):");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the x-coordinate of the second point (x2):");
        double x2 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate of the second point (y2):");
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

    }
}
