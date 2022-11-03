package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int foodTruckId = 0;
	private String foodTruckName;
	private String foodType;
	private int foodTruckrating;
	private int count = 0;
	private int id;

	public FoodTruck() {

	}

	public FoodTruck(String foodTruckName, String foodType, int foodTruckrating) {
		foodTruckId++;
		this.id = foodTruckId;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.foodTruckrating = foodTruckrating;
		// ssetFoodTruckId(id);

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

	// method to display food tricks
	public void printTrucks(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			if (foodTruck != null) {

				foodTruck.displayTruck();
			}

		}
	}

	// to string method
	public String toString() {

		String output = "Foodtruck Id " + id + " " + " Food Truck Name = " + foodTruckName + ", Food Type = " + foodType
				+ ", Food Truck Rating = " + foodTruckrating;
		return output;
	}

	public void displayTruck() {
		String truckData = this.toString();
		System.out.println(truckData);
	}

	// calcualate average rating
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

	// calculate highest rating
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
		System.out.println(foodHighestRatingFoodTruck);

	}

}
