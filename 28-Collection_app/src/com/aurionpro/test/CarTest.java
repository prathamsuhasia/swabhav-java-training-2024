package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Car;


public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();
		readCars(scanner,cars);
		printCars(cars);
		maxMileageCar(cars);
		
		
	}
	private static void readCars(Scanner scanner,List<Car> cars) {
		System.out.println("Enter number of cars");
		int numberOfCars = scanner.nextInt();
		for(int i =0 ; i<numberOfCars ; i++) {
	     	System.out.println("Enter card ID");
        	int carID = scanner.nextInt();
        	System.out.println("Enter company name ");
        	String companyName = scanner.next();
        	System.out.println("Enter price");
        	double price = scanner.nextDouble();
        	System.out.println("Enter mileage");
        	double mileage = scanner.nextDouble();
        	 cars.add(new Car(carID, companyName, price, mileage));
		}
	}
	private static void printCars(List<Car> cars) {
		for(Car car:cars) {
			System.out.println(car);
		}
	}
	
	private static void maxMileageCar(List<Car> cars) {

	    Car maxMileageCar = cars.get(0);

	    for (Car car : cars) {
	        if (car.getMileage() > maxMileageCar.getMileage()) {
	            maxMileageCar = car;
	        }
	    }

	    System.out.println("Car with maximum mileage:");
	    System.out.println(maxMileageCar);
	}

}
