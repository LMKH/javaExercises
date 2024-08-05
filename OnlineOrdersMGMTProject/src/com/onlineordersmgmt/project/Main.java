package com.onlineordersmgmt.project;
import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

public class Main {

	public static void main(String[] args) {
		//creating a brand new CustomerOrder object
		
		//LocalDate.now - used to obtain the current date from the system clock in a default time-zone 
		
		//order number, customer name & date of order
		CustomerOrder order = new CustomerOrder("TLVQ41", "Conner Quinn", LocalDate.now());
		
		//displaying the order information to the console
		order.displayOrderInformation();
		
		System.out.println();//for readability
		
		//creating a brand new OrdersOnline object
		
		//order number, customer name, date of order, customer address and tracking number 
		OrdersOnline onlineOrder = new OrdersOnline("JRSZ28", "Becky Moore", LocalDate.now(), "94 Oasis Close, Manchester", "CL2009");
		
		//displaying the online order information to the console
		onlineOrder.displayOrderInformation();
		
		System.out.println();//for readability
		
		//for calculating & displaying the delivery time
		int estimatedDeliveryTime = onlineOrder.calculateTotalDeliveryTime();
		
		//displaying to the console
		System.out.println("The estimated delivery time of your order is " + estimatedDeliveryTime + " days.");
		
		//update and display the tracking status
		onlineOrder.updateTrackingInformation("On its way!");
	}
}