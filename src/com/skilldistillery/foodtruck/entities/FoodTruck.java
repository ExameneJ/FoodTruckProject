package com.skilldistillery.foodtruck.entities;


import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class FoodTruck {
	Scanner scanner = new Scanner(System.in);
	private static int foodTruckId = 0;
	private FoodTruck[] foodTrucks = new FoodTruck[5];
	private String foodTruckName;
	private String foodType;
	private int foodTruckrating;
	private int count = 0;
	private int id;

	public FoodTruck() {
		
	

	}

	

	public FoodTruck(String foodTruckName, String foodType, int foodTruckrating) {
		FoodTruck.foodTruckId++;
		id = foodTruckId;
		
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.foodTruckrating = foodTruckrating;
		setFoodTruckId(id);
		
	}
	
	
	

	
	


	public int getFoodTruckId() {

		return foodTruckId;
	}

	public void setFoodTruckId(int foodTruckId) {
		System.out.println(id);
		
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
				foodTrucks[count] = foods;
				count++;
				
	
				
				
		

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

	//to string method
	public String toString() {

		String output = " Food Truck Name = " + foodTruckName + ", Food Type = " + foodType + ", Food Truck Rating = "
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
	
	
public void secondMenu(FoodTruck[] foodtrucks) {
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
		}else if (inputString.equals("1")) {
			foods.printTrucks(foodTrucks);
			
		} else if (inputString.equals("2")) {
			System.out.println(foods.averageRatingTrucks(foodTrucks));
		
		}else if (inputString.equals("3")) {
			foods.highestRating(foodTrucks);
			
			
		}
		System.out.println();
				
		
	}
		
	
				
	
				
				
		

	
	}

	
		
	
		
	
			
		
		
	
		
		
	

	

}
