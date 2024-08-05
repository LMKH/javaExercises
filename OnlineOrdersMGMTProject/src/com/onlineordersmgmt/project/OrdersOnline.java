package com.onlineordersmgmt.project;

import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

//the OrdersOnline subclass extends to the CustomerOrder class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class OrdersOnline extends CustomerOrder{
	
	//new created private attributes for the customer's address & order tracking number
	private String customerDeliveryAddress;
	private String orderTrackingNumber;
	
	//constructor to initialise the OrdersOnline object & it's attributes + call the superclass constructor to initialise the common attributes
	public OrdersOnline(String customerOrderID, String customer, LocalDate dateOfOrder, String customerDeliveryAddress, String orderTrackingNumber) {
		//Calling the super classes constructor 
		super(customerOrderID, customer, dateOfOrder);
		this.customerDeliveryAddress = customerDeliveryAddress;
		this.orderTrackingNumber = orderTrackingNumber;
	}
	
	//getter for the delivery address + return the value
	public String getCustomerDeliveryAddress() {
		return customerDeliveryAddress;
	}
	
	//getter for the orderTrackingNumber + return the value
	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}
	
	//method to calculate the delivery time
	public int calculateTotalDeliveryTime() {
		//returns the value based on the length of the customerDeliveryAddress string. it returns a number between 1-10
		//modulo % 10 - returns the remainder when the length is divided by 10. ensures the result is between 0 - 9. + 1 added to adjust the result to 1 - 10.
		return customerDeliveryAddress.length() % 10 + 1;
	}
	
	//method to update the tracking information
	public void updateTrackingInformation(String updatedStatus) {
		System.out.println("Your tracking number is: " + orderTrackingNumber + ". The status of your order is: " + updatedStatus);
	}
	
	//override the displayOrderInformation() method. done so the OrdersOnline attributes and additions can be included in the displayOrderInformation() method
	@Override
	public void displayOrderInformation() {
		//calls the super class to display the new additional attributes 
		super.displayOrderInformation();
		//displaying the OrdersOnline attributes to the console
		System.out.println("The delivery address is: " + customerDeliveryAddress);
		System.out.println("The order tracking number is: " + orderTrackingNumber);
	}
}