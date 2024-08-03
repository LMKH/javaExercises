package com.restaurant.project;
//import java.util.arraylist - to create array lists
import java.util.ArrayList;

public class Restaurant {
	//declaring Array lists, here is where the items on the menu, prices, ratings and item count is stored
	private ArrayList<String> menuChoices;
	private ArrayList<Double> menuPrices;
	private ArrayList<Integer> menuRatings;
	private ArrayList<Integer> menuItemCount;
	
	//constructor to initialise the above ArrayLists
	public Restaurant() {
		this.menuChoices = new ArrayList<>();
		this.menuPrices = new ArrayList<>();
		this.menuRatings = new ArrayList<>();
		this.menuItemCount = new ArrayList<>();
	}
	
	//method for adding choices to the menu + adding the price along with it
	public void addChoiceToMenu(String choice, double price) {
		//adding choice to menu choices
		this.menuChoices.add(choice);
		//adding price to menu prices
		this.menuPrices.add(price);
		//initialising and adding the rating for the menu choice to 0
		this.menuRatings.add(0);
		//Initialising and adding the menu item count for the menu choice to 0
		this.menuItemCount.add(0);
	}
	
	//method for doing the reverse, by removing choices from the menu
	public void removeChoiceFromMenu(String choice) {
		//getting the index of the menu choice from the menu choice array list
		int index = this.menuChoices.indexOf(choice);
		//if the choice exists on the menu - remove every part of it from the menu - the choice itself, the price, the ratings and the item count
		if (index != -1) {
			//remove it from the menu choices
			this.menuChoices.remove(index);
			//remove the price of the choice
			this.menuPrices.remove(index);
			//remove the rating of the choice
			this.menuRatings.remove(index);
			//remove the item count from the menu item count array list
			this.menuItemCount.remove(index);
		}
	}
	
	//method for adding a rating to the menu choice
	public void addMenuRating(String choice, int rating) {
		//getting the index of the menu choice from the menu choices array list
		int index = this.menuChoices.indexOf(choice);
		//if the choice exists on the menu - get its current rating, get the menu item count of the choice, update the rating + the item count of the choice
		if (index != -1) {
			//retrieve the current menu choice rating
			int currentMenuRating = this.menuRatings.get(index);
			//retrieve the current menu choice index count
			int totalMenuCount = this.menuItemCount.get(index);
			//now to update the rating of the menu choice
			this.menuRatings.set(index, currentMenuRating + rating);
			//finally to update the item count, incrementing the value by 1
			this.menuItemCount.set(index, totalMenuCount + 1);
		}
	}
	
	//method for getting the average rating for a menu choice
	public double getAverageMenuRating(String choice) {
		//getting the index of the menu choice from the menu choices array list
		int index = this.menuChoices.indexOf(choice);
		//if the choice exists on the menu - get the total rating of the menu choice, get the menu item count of the choice, calculate and return the average rating 
		//return nothing if the choice does not exist on the menu.
		if (index != -1) {
			//get the total rating of the menu choice
			int totalMenuRating = this.menuRatings.get(index);
			//get the menu item count of the menu choice
			int itemCountPlacement = this.menuItemCount.get(index);
			//Calculate and return the average rating
			
			//following code explained:
			
			//checks if itemCountPlacement is greater than 0. 
			//if true, it calculates the average rating by dividing totalMenuRating by itemCountPlacement and returns the result as a double
			//if itemCountPlacement is 0 or less, it returns 0.0.
			return itemCountPlacement > 0 ? (double) totalMenuRating / itemCountPlacement : 0.0;
		}
		//else, if the item does not exist, return nothing
		else {
			return 0.0;
		}
	}
	
	//now to display the menu to the console
	public void displayMenuChoices() {
		//for loop. loop through and iterate through each menu choice with their prices, until all are displayed
		for (int i = 0; i < menuChoices.size(); i++) {
			//print each item with its corresponding price tag
			System.out.println(menuChoices.get(i) + " is £" + menuPrices.get(i));
		}
	}
	
	//method to calculate all the average ratings of each menu choice
	public double calculateAverageMenuRating() {
		//initialise the total menu rating to 0
		double totalMenuRating = 0;
		//Initialise the number of ratings to 0
		double numberOfRatings = 0;
		//for loop. loop through and iterate through each menu rating in the menu ratings array list
		for (int i = 0; i < menuRatings.size(); i++) {
			//add on the ratings to the total menu rating
			totalMenuRating += menuRatings.get(i);
			//then increment the number of ratings
			numberOfRatings += menuItemCount.get(i);
		}
		//finally to calculate and return to the console the total average of ratings
		return numberOfRatings > 0 ? totalMenuRating / numberOfRatings : 0.0;
	}
}