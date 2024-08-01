package com.inventory.project;

public class Item {
	//here in variables is where we will store the name and quantity of the item
	private String itemName;
	private int itemQuantity;
	
	//constructor to initialise the above variables - the name and quantity of the item
	public Item(String itemName, int itemQuantity) {
		//assigning the parameters to their respective variables
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
	}
	
	//getter & setter methods
	//get and return the name
	public String getItemName(){
		return itemName;
	}
	//set and assign the name
	public void setName(String itemName) {
		this.itemName = itemName;
	}
	
	//get and return the quantity of the item
	public int getItemQuantity() {
		return itemQuantity;
	}
	//set and assign the quantity
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}