package com.resortandrailway.project;
import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

//the ResortReservation subclass extends to the Reservation class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class ResortReservation extends Reservation {
	
	//new additional attribute created for the ResortReservation subclass - for the hotel room's number
	private int customerRoomNumber;
	
	//constructor to initialise the ResortReservation subclass + the new attribute + call the superclass's constructor to initialise the common attributes
	public ResortReservation(String customerReservationID, String customerName, LocalDate reservationDate, int customerRoomNumber) {
		//call the superclass constructor
		super(customerReservationID, customerName, reservationDate);
		this.customerRoomNumber = customerRoomNumber;
	}
	
	//Override - now we need to override the checkReservationInfoStatus() method, which prints out to the console. 
	//we need to do this so that we can include the ResortReservation's customerRoomNumber attribute, alongside the other attributes. this is for Resort Reservation ONLY.
	
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	@Override
	public void checkReservationInfoStatus() {
		//calling the super class method
		super.checkReservationInfoStatus();
		System.out.println("The customers hotel room number is - " + customerRoomNumber);
	}
	
	//method to modify, updated & change the Reservation Info, now including the ResortReservation's customerRoomNumber attribute
	public void updateReservation(String updatedCustomerName, LocalDate updatedReservationDate, int customerRoomNumber) {
		//calling the super class method
		super.updateReservation(updatedCustomerName, updatedReservationDate);
		this.customerRoomNumber = customerRoomNumber;
		//confirmation message printed out to the console to notify the user of the update.
		System.out.println("Attention - The hotel room number has been successfully updated.");
	}
	
	//getter for the hotel room number
	//get the hotel room number + return the value
	public int getCustomerRoomNumber() {
		return customerRoomNumber;
	}
}