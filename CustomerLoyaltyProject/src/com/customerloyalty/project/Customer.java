package com.customerloyalty.project;

import java.util.ArrayList; //for array lists
import java.util.List; 
//list - provides a way to store the ordered collection. it is an ordered collection of objects in which duplicate values can be stored. 
//list allows positional access and placement of elements.

public class Customer {
	//creating private attributes for the customer's; name, email, and purchase history
	private String customerName;
	private String customerEmailAddress;
	private List<Double> customerPurchaseHistory;
	
	//constructor to initialise the customers name and email address 
	public Customer(String customerName, String customerEmailAddress) {
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		//initialising the purchase history of the customer to an empty array list
		this.customerPurchaseHistory = new ArrayList<>();
	}
	
	//method to add a purchase amount to the purchase history list
	public void addCustomerPurchaseHistory(double amount) {
		customerPurchaseHistory.add(amount);
	}
	
	//method for calculating up the total payment amount 
	//this is what the customer must pay. by totalling up all the purchase history, what is returned will be how much the customer needs to pay
	public double calculateCustomerPaymentAmount() {
		//set to 0 as a starter base.
		double totalPayment = 0;
		//the for loop will go through all the customer purchases in the purchase history list - and it will total up the amount and return the value.
		for (double customerPurchase : customerPurchaseHistory) {
			totalPayment += customerPurchase;
		}
		//return the total payment
		return totalPayment;
	}
	
	//getter method
	//get + return the customerName attribute
	public String getCustomerName() {
		return customerName;
	}
	
	//get + return the customerEmailAddress attribute
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	
	//get + return the purchase history
	public List<Double> getCustomerPurchaseHistory(){
		return customerPurchaseHistory;
	}
}