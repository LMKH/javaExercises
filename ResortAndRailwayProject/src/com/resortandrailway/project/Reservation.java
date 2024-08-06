package com.resortandrailway.project;
import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

public class Reservation {
	//creating private attributes to hold the customers reservationID, customer name & the current date
	private String customerReservationID;
	private String customerName;
	private LocalDate reservationDate;
	
	//constructor to initialise the reservation object + its attributes to their respective parameters
	public Reservation(String customerReservationID, String customerName, LocalDate reservationDate) {
		this.customerReservationID = customerReservationID;
		this.customerName = customerName;
		this.reservationDate = reservationDate;
	}
	
	//this is the method to check the reservation information + status
	public void checkReservationInfoStatus() {
		System.out.println("\nThe customer reservation ID - " + customerReservationID);
		System.out.println("The customers name is - " + customerName);
		System.out.println("The date of the reservation is booked for - " + reservationDate);
		System.out.println("The reservation status is - booked and confirmed");
	}
	
	//method to modify, updated & change the Reservation Info
	public void updateReservation(String updatedCustomerName, LocalDate updatedReservationDate) {
		this.customerName = updatedCustomerName;
		this.reservationDate = updatedReservationDate;
		System.out.println("Attention - The reservation has been successfully updated.");
	}
	
	//getter methods for the Reservation attributes
	//get the customerReservationID and return the value
	public String getCustomerReservationID() {
		return customerReservationID;
	}
	
	//get the customerName and return the value
	public String getCustomerName() {
		return customerName;
	}
	
	//get the reservationDate and return the value
	public LocalDate reservationDate() {
		return reservationDate;
	}
}