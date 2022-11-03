package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		FoodTruck[] foodTrucks = new FoodTruck[5];

		FoodTruck foodTruck = new FoodTruck();
		

		System.out.println();

		

	


	int count = 0;
		
		while (count < foodTrucks.length) {
			FoodTruck foods = new FoodTruck();
			System.out.println();

			System.out.println("What is the food Truck Name");
			String truckName = scanner.next();
			if (truckName.equals("quit")) {
				System.out.println("stopped");
				break;
			} else {
				System.out.println("What Food Truck Type");
				String foodType = scanner.next();
				System.out.println("What is the food rating");
				int foodRating = scanner.nextInt();
				foods = new FoodTruck(truckName, foodType, foodRating );
				foodTrucks[count] = foods;
				count++;
			}
		}
		System.out.println();


			
			
	
		
	

		boolean isContinue = true;
		while (isContinue) {
			FoodTruck foods = new FoodTruck();
			String inputString;
			System.out.println("Choose a menu item using the numeric value or Entering quit");

			System.out.println("1 List all existing food trucks.");
			System.out.println("2 See the average rating of food trucks.");
			System.out.println("3 Display the highest-rated food truck.");
			System.out.println("4 Quit the program.");
			inputString = scanner.next().toLowerCase();
			if (inputString.equals("quit") || inputString.equals("4")) {
				System.out.println("Existing Program...");
				break;
			} else if (inputString.equals("1")) {
				foods.printTrucks(foodTrucks);

			} else if (inputString.equals("2")) {
				System.out.println(foods.averageRatingTrucks(foodTrucks));

			} else if (inputString.equals("3")) {
				foods.highestRating(foodTrucks);

			}
			System.out.println();

		}

	}
}
