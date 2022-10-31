package com.skilldistillery.foodtruck.entities;


import java.util.Arrays;
import java.util.Scanner;

public class FoodTruck {
	Scanner scanner = new Scanner(System.in);
	private static int foodTruckId = 0;
	private FoodTruck[] foodTrucks = new FoodTruck[5];
	private String foodTruckName;
	private String foodType;
	private int foodTruckrating;
	private int count = 0;

	public FoodTruck() {

	}

	

	public FoodTruck(String foodTruckName, String foodType, int foodTruckrating) {
		FoodTruck.foodTruckId = foodTruckId;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.foodTruckrating = foodTruckrating;
		foodTruckId++;

	}

	public int getFoodTruckId() {

		return foodTruckId;
	}

	public void setFoodTruckId(int foodTruckId) {
		FoodTruck.foodTruckId = foodTruckId;

	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodTruckrating() {
		return foodTruckrating;
	}

	public void setFoodTruckrating(int foodTruckrating) {
		this.foodTruckrating = foodTruckrating;
	}

	
	//Method that will show prompt and do the initiall creation of foodtrucks
	public FoodTruck[] enterFoodtruck(int number) {
		
		while (count < number) {
			FoodTruck foods = new FoodTruck();
			System.out.println();

			System.out.println("What is the food Truck Name");
			

			this.foodTruckName = scanner.next().toLowerCase();
			if (this.foodTruckName.equals("quit")) {
				System.out.println("stopped");
				break;
			} else {
				System.out.println("What Food Truck Type");
				this.foodType = scanner.next();
				System.out.println("What is the food rating");
				this.foodTruckrating = scanner.nextInt();
				foods = new FoodTruck(this.foodTruckName, this.foodType, this.foodTruckrating);
				FoodTruck.foodTruckId++;
				foodTrucks[count] = foods;
				count++;
				printTrucks(foodTrucks);
		

			}

		}

		return foodTrucks;

	}

	//method to display food tricks
	public void printTrucks(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			if (foodTruck != null) {
				
				foodTruck.displayTruck();
			}

		}
	}

	//to sting mehtod
	public String toString() {
		String output =" Food Truck Name = " + foodTruckName + ", Food Type = " + foodType + ", Food Truck Rating = "
				+ foodTruckrating;
		return output;
	}

	public void displayTruck() {
		String truckData = this.toString();
		System.out.println(truckData);
	}

	//calcualate average rating
	public int averageRatingTrucks(FoodTruck[] trucks) {
		int rating = 0;
		int count = 0;

		for (FoodTruck foodTruck : trucks) {
			if (foodTruck != null) {
				rating += foodTruck.foodTruckrating;
				count++;

			}

		}
		return rating / count;

	}

	
	
	//calculate highest rating
	public void highestRating(FoodTruck[] trucks) {
		int highestRating = 0;
		FoodTruck foodHighestRatingFoodTruck = new FoodTruck();
		
		for (int i = 0; i < trucks.length; i++) {
				if (trucks[i] != null) {
					if (trucks[i].foodTruckrating > highestRating) {	
						foodHighestRatingFoodTruck = trucks[i];
						highestRating = foodHighestRatingFoodTruck.foodTruckrating;
						
					}
					
				}
				
			
		}
		System.out.println(foodHighestRatingFoodTruck );
		
	}

	
		
	
		
	
			
		
		
	
		
		
	

	

}
