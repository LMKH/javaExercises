package com.onlineordersmgmt.project;

import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

public class CustomerOrder {
	//creating private attributes for the customer order id, the customer and the date of order
	private String customerOrderID;
	private String customer;
	private LocalDate dateOfOrder;
	
	//constructor to initialise the CustomerOrder object + the attributes to their respective parameters
	public CustomerOrder(String customerOrderID, String customer, LocalDate dateOfOrder) {
		this.customerOrderID = customerOrderID;
		this.customer = customer;
		this.dateOfOrder = dateOfOrder;
	}
	
	//getter methods
	//get id and return value
	public String getCustomerOrderID() {
		return customerOrderID;
	}
	
	//get customer and return value
	public String getCustomer() {
		return customer;
	}
	
	//get date of order and return value
	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
	
	//method to display the order information
	public void displayOrderInformation() {
		System.out.println("The customer order ID is: " + customerOrderID);
		System.out.println("The customer is: " + customer);
		System.out.println("The date of the order: " + dateOfOrder);
	}
}