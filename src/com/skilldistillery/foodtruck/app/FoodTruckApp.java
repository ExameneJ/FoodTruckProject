package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruck[] foodTrucks = new FoodTruck[5];

		FoodTruck foodTruck = new FoodTruck();
		foodTrucks = foodTruck.enterFoodtruck(foodTrucks.length);

		System.out.println();
		
		foodTruck.secondMenu(foodTrucks);
		
		
		
		
		
	

	}

}
