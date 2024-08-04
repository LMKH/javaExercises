package com.travelsearch.project;

public class Flight {
	//declaring an integer variable to hold the flight number
	private int flightNumberIndex;
	//declaring a string variable to hold the flightPassengerName
	private String flightPassengerName; 
	//declaring a string variable to hold the flightOrigin
	private String flightOrigin;
	//declaring a string variable to hold the flightDestination
	private String flightDestination;
	//declaring a string variable to hold the flightDate
	private String flightDate;
	//declaring a integer variable to hold the flightTotalPassangers
	private int flightTotalPassangers;
	//declaring a double variable to hold the flightPrice
	private double flightPrice;
	//declaring a integer variable to hold the confirmationNumber
	private int confirmationNumber;
	
	//Constructor to initialise the flight object and the above variables to their respective provided details
	public Flight(int flightNumberIndex, String flightPassengerName, String flightOrigin, String flightDestination, String flightDate, int flightTotalPassangers, double flightPrice) {
		this.flightNumberIndex = flightNumberIndex;
		this.flightPassengerName = flightPassengerName;
		this.flightOrigin = flightOrigin;
		this.flightDestination = flightDestination;
		this.flightDate = flightDate;
		this.flightTotalPassangers = flightTotalPassangers;
		this.flightPrice = flightPrice;
	}
	
	//now to get + return everything 
	public int getFlightNumberIndex(){
		return flightNumberIndex;
	}
	
	public String getFlightPassengerName() {
		return flightPassengerName;
	}
	
	public String getFlightOrigin() {
		return flightOrigin;
	}
	
	public String getFlightDestination() {
		return flightDestination;
	}
	
	public String getflightDate() {
		return flightDate;
	}
	
	public int getFlightTotalPassangers() {
		return flightTotalPassangers;
	}
	
	public double getFlightPrice() {
		return flightPrice;
	}
	
	public int getConfirmationNumber() {
		return confirmationNumber;
	}
	
	//lastly, to set the confirmation number
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
}