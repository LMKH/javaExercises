package com.restaurant.project;

public class Main {

	public static void main(String[] args) {
		//creating a new restaurant object - so here now we can add things to the menu + the prices
		//below is the menu of our restaurant w/ the respective prices of each menu choice
		Restaurant restaurant = new Restaurant();
		restaurant.addChoiceToMenu("Vegetable Soup w/ Bread", 2.49);
		restaurant.addChoiceToMenu("Bacon Cheeseburger and Chips" , 5.49);
		restaurant.addChoiceToMenu("Doner Kabab w/ Salad", 6.99);
		restaurant.addChoiceToMenu("Small Fish and Chips", 4.39);
		restaurant.addChoiceToMenu("Large Fish and Chips", 7.39);
		restaurant.addChoiceToMenu("Chicken Tikka Masala w/ Rice", 5.99);
		restaurant.addChoiceToMenu("12' Vegan Cheese & Tomato Pizza", 6.99);
		restaurant.addChoiceToMenu("Small Chips", 1.99);
		restaurant.addChoiceToMenu("Large Chips", 2.99);
		restaurant.addChoiceToMenu("Vegan Vanilla Ice Cream", 3.99);
		
		//printing a header to the console
		System.out.println("Welcome to Billy's Big Eatery! Have a look at our menu below!");
		System.out.println("");
		//and to print all of the menu above to the console
		restaurant.displayMenuChoices();
		
		//adding some ratings to the menu choices
		restaurant.addMenuRating("Vegetable Soup w/ Bread", 5);
		restaurant.addMenuRating("Vegetable Soup w/ Bread", 4);
		restaurant.addMenuRating("Doner Kabab w/ Salad", 4);
		restaurant.addMenuRating("Doner Kabab w/ Salad", 3);
		restaurant.addMenuRating("Small Fish and Chips", 4);
		restaurant.addMenuRating("Small Fish and Chips", 5);
		restaurant.addMenuRating("Chicken Tikka Masala w/ Rice", 5);
		restaurant.addMenuRating("Chicken Tikka Masala w/ Rice", 5);
		restaurant.addMenuRating("12' Vegan Cheese & Tomato Pizza", 5);
		restaurant.addMenuRating("12' Vegan Cheese & Tomato Pizza", 3);
		restaurant.addMenuRating("Vegan Vanilla Ice Cream", 4);
		restaurant.addMenuRating("Vegan Vanilla Ice Cream", 5);
		
		//using unique variable names - avoids re-declaration errors
		//getting the average rating for Vegetable Soup w/ Bread
		double averageRatingVegSoup = restaurant.getAverageMenuRating("Vegetable Soup w/ Bread");
		//printing out the average rating for Vegetable Soup w/ Bread
		System.out.println("\nThe average rating for our Vegetable Soup w/ Bread is " + averageRatingVegSoup + ".");
		
		//getting the average rating for Doner Kabab w/ Salad
		double averageRatingDonerKabab = restaurant.getAverageMenuRating("Doner Kabab w/ Salad");
		//printing out the average rating for Doner Kabab w/ Salad
		System.out.println("The average rating for our Doner Kabab w/ Salad is " + averageRatingDonerKabab + ".");
		
		//getting the average rating for Small Fish and Chips
		double averageRatingSmallFishAndChips = restaurant.getAverageMenuRating("Small Fish and Chips");
		//printing out the average rating for Small Fish and Chips
		System.out.println("The average rating for our Small Fish and Chips is " + averageRatingSmallFishAndChips + ".");
		
		//getting the average rating for Chicken Tikka Masala w/ Rice
		double averageRatingChickenTikka = restaurant.getAverageMenuRating("Chicken Tikka Masala w/ Rice");
		//printing out the average rating for Chicken Tikka Masala w/ Rice
		System.out.println("The average rating for our Chicken Tikka Masala w/ Rice is " + averageRatingChickenTikka + ".");
		
		//getting the average rating for 12' Vegan Cheese & Tomato Pizza
		double averageRatingPizza = restaurant.getAverageMenuRating("12' Vegan Cheese & Tomato Pizza");
		//printing out the average rating for 12' Vegan Cheese & Tomato Pizza
		System.out.println("The average rating for our 12' Vegan Cheese & Tomato Pizza is " + averageRatingPizza + ".");
		
		//getting the average rating for Vegan Vanilla Ice Cream
		double averageRatingIceCream = restaurant.getAverageMenuRating("Vegan Vanilla Ice Cream");
		//printing out the average rating for Vegan Vanilla Ice Cream
		System.out.println("The average rating for our Vegan Vanilla Ice Cream is " + averageRatingIceCream + ".");
		
		//finally an overall average of all menu choices 
		System.out.println("\nBilly's Big Eatery! has a total rating of " + restaurant.calculateAverageMenuRating() + " out of 5 stars! We are super proud of this! \nThank you to all our customers for your continued patronage.");
		
		//now for removing a menu choice
		//first, a message letting the user know via the console Vegan Vanilla Ice Cream has been removed
		System.out.println("\nWe have removed Vegan Vanilla Ice Cream from our menu.");
		//removing the item
		restaurant.removeChoiceFromMenu("Vegan Vanilla Ice Cream");
		//print out a new header and new updated menu
		System.out.println("\nSee our new menu below!");
		System.out.println("");
		restaurant.displayMenuChoices();
		//confirmed Vegan Vanilla Ice Cream has been removed from the menu
	}
}