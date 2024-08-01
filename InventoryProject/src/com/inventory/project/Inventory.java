package com.inventory.project;
//firstly, import java.util.ArrayList - allows the creation of array lists
import java.util.ArrayList;

public class Inventory {
	//here is where we store the list of Item objects
	private ArrayList<Item> items;
	
	//constructor to initialise the items field
	public Inventory() {
		//creating a new ArrayList to hold the item objects
		items = new ArrayList<Item>();
	}
	
	//now the method for adding an item to the items list - using the add method()
	public void addItem(Item item) {
		items.add(item);
	}
	
	//and for the reverse, to remove an item from the items list - using the remove method()
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	//now the method to check if the items in the inventory are running low
	public void checkIfInventoryLow() {
		//a for loop to iterate through the list of items
		//so run through all the items to all are checked.
		for (Item item : items) {
			//now an if statement - this is asking to check if any of the items are running low i.e getting the item quantity and seeing if the quantity value is less than or equal to 50
			if (item.getItemQuantity() <= 50) {
				//if the if statement is correct and an items quantity is less than or equal to 50, the following message will print to the console
				System.out.println("Attention please - " + item.getItemName() + " is running low in the inventory. Please restock as soon as possible. The current quantity of " + item.getItemName() + " is " + item.getItemQuantity());
			}
		}
	}
}