package com.inventory.project;

public class Main {

	public static void main(String[] args) {
		//first, creating a new instance of the Inventory Class
		Inventory inventory = new Inventory();
		
		//creating new Item objects with a itemName and a quantity
		Item item1 = new Item("Decaf Coffee", 60);
		Item item2 = new Item("Vegan Chocolate Bars", 50);
		Item item3 = new Item("Green Tea", 65);
		Item item4 = new Item("Vegan Vanilla Ice Cream", 55);
		Item item5 = new Item("Orange Juice", 45);
		
		//now printing a message to the console to let the user know the items are being added to the inventory
		System.out.println("Adding the items to the inventory");
		//adding all the items to the inventory
		inventory.addItem(item1);
		inventory.addItem(item2);
		inventory.addItem(item3);
		inventory.addItem(item4);
		inventory.addItem(item5);
		
		//a message printing to the console letting the user know the programme is checking the quantity of each item in the inventory
		System.out.println("\nChecking the inventory for any low quantity items...");
		//programme checks the quantity of each item
		//programme then prints out a message to the console the user can see what items are low quantity
		inventory.checkIfInventoryLow();
		
		//now if an item is removed from the from the inventory in its entirety - so if we remove item 2 "chocolate bars" - the following message will verify that
		System.out.println("\nYou have removed " + item2.getItemName() + " from the inventory!");
		inventory.removeItem(item2);
		
		//a message printing to the console letting the user know the programme is checking the quantity of each item in the inventory again
		//now item 2 has been removed it will not be displayed in the updated check
		System.out.println("\nChecking the inventory for any low quantity items...");
		inventory.checkIfInventoryLow();
	}
}