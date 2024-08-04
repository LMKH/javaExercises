package com.customerloyalty.project;

//the LoyalCustomer subclass extends to the Customer class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class LoyalCustomer extends Customer{
	
	//creating a private attribute for loyal customer discount rate
	private double loyalCustomerDiscountRate;
	
	//constructor to initialise the LoyalCustomer attribute and the Customer object + call the constructor of the superclass (Customer)
	public LoyalCustomer(String customerName, String customerEmailAddress, double loyalCustomerDiscountRate) {
		super(customerName, customerEmailAddress);
		this.loyalCustomerDiscountRate = loyalCustomerDiscountRate;
	}
	
	//this method calculates up the discount amount
	public double applyLoyalCustomerDiscountRate(double amount) {
		return amount - (amount * loyalCustomerDiscountRate / 100);
	}
	
	//now we need to override the addCustomerPurchaseHistory() method, which prints out to the console. 
	//we need to do this so that we can include the discount before adding the purchase alongside the other attributes.
	
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	@Override
	public void addCustomerPurchaseHistory(double amount) {
		double loyalCustomerDiscountedRate = applyLoyalCustomerDiscountRate(amount);
		super.addCustomerPurchaseHistory(loyalCustomerDiscountedRate);
		//so now it has called the super class method to add the discounted amount
	}
	
	//getter & setter methods - to provide access to the discounts
	//get + return the discount rate
	public double getLoyalCustomerDiscountRate() {
		return loyalCustomerDiscountRate;
	}
	
	//set the discount rate
	public void setLoyalCustomerDiscountRate(double loyalCustomerDiscountRate) {
		this.loyalCustomerDiscountRate = loyalCustomerDiscountRate;
	}
}