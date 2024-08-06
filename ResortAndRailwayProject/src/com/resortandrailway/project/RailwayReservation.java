package com.resortandrailway.project;
import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

//the RailwayReservation subclass extends to the Reservation class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class RailwayReservation extends Reservation{
	
	//new additional attribute created for the RailwayReservation subclass - this is for the customers train seat number 
	private int customerTrainSeatNumber;
	
	//constructor to initialise the RailwayReservation subclass + the new attribute + call the superclass's constructor to initialise the common attributes
	public RailwayReservation(String customerReservationID, String customerName, LocalDate reservationDate, int customerTrainSeatNumber) {
		//calling the super class constructor
		super(customerReservationID, customerName, reservationDate);
		this.customerTrainSeatNumber = customerTrainSeatNumber;
	}
	
	//method to check the reservation info status including the new customerTrainSeatNumber attribute.
	//Override - now we need to override the checkReservationInfoStatus() method, which prints out to the console. 
	//we need to do this so that we can include the RailwayReservation customerTrainSeatNumber attribute, alongside the other attributes. this is for Railway Reservation ONLY.
	@Override
	public void checkReservationInfoStatus() {
		//calling the super class method
		super.checkReservationInfoStatus();
		System.out.println("The customers train seat number is - " + customerTrainSeatNumber);
	}
	
	//method to modify, updated & change the Reservation Info, now including the RailwayReservation's customerTrainSeatNumber attribute
	public void updateReservation(String updatedCustomerName, LocalDate updatedReservationDate, int customerTrainSeatNumber) {
		//calling the super class method
		super.updateReservation(updatedCustomerName, updatedReservationDate);
		this.customerTrainSeatNumber = customerTrainSeatNumber;
		//confirmation message printed out to the console to notify the user of the update.
		System.out.println("Attention - The train seat number has been successfully updated.");
	}
	
	//getter for the train seat number
	//get the train seat number + return the value
	public int getCustomerTrainSeatNumber() {
		return customerTrainSeatNumber;
	}
}