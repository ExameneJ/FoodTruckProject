package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruck[] foodTrucks = new FoodTruck[5];
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true;

		FoodTruck foodTruck = new FoodTruck();
		foodTrucks = foodTruck.enterFoodtruck(foodTrucks.length);
		

		System.out.println();
		
		
		
		while (isContinue) {
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
				foodTruck.printTrucks(foodTrucks);
				
			} else if (inputString.equals("2")) {
				System.out.println(foodTruck.averageRatingTrucks(foodTrucks));
			
			}else if (inputString.equals("3")) {
				foodTruck.highestRating(foodTrucks);
				
				
			}
			System.out.println();
			
		}
		
	

	}

}
