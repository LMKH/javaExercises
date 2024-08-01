package com.airplaneflight.project;
//firstly, i need to import the LocalTime class from the java.time package
//local time class represents time in an hour-minute-second format
import java.time.LocalTime;

public class Airplane {
	//private fields to store the aeroplanes flight number, the destination, the scheduled flight time of the aeroplane and the delay time.
	private String airplaneFlightNumber;
	private String airplaneDestination;
	private LocalTime airplaneScheduledDeparture;
	private int airplaneDelayTime;
	
	//constructor to initialise the above variables fields and assign them to their respective parameters.
	public Airplane(String airplaneFlightNumber, String airplaneDestination, LocalTime airplaneScheduledDeparture) {
		this.airplaneFlightNumber = airplaneFlightNumber;
		this.airplaneDestination = airplaneDestination;
		this.airplaneScheduledDeparture = airplaneScheduledDeparture;
		//delay time set to 0, for 0 minutes
		this.airplaneDelayTime = 0;
	}
	
	//getter & setter methods - 
	//get method to get the airplaneFlightNumber and return the airplaneFlightNumber field
	public String getAirplaneFlightNumber() {
		return airplaneFlightNumber;
	}
	//set method to set the airplaneFlightNumber parameter to the airplaneFlightNumber field
	public void setAirplaneFlightNumber(String airplaneFlightNumber) {
		this.airplaneFlightNumber = airplaneFlightNumber;
	}
	
	//get the airplaneDesitnation and return the airplaneDestination field
	public String getAirplaneDestination() {
		return airplaneDestination;
	}
	//set the airplaneDestination parameter to the airplaneDestination field
	public void setAirplaneDestination(String airplaneDestination) {
		this.airplaneDestination = airplaneDestination;
	}
	
	//get the airplaneScheduledDeparture and return the airplaneScheduledDeparture field
	public LocalTime getAirplaneScheduledDeparture() {
		return airplaneScheduledDeparture;
	}
	//set the airplaneScheduledDeparture and return the airplaneScheduledDeparture field
	public void setAirplaneScheduledDeparture(LocalTime airplaneScheduledDeparture) {
		this.airplaneScheduledDeparture = airplaneScheduledDeparture;
	}
	
	//get method for the delay time
	public int getAirplaneDelayTime() {
		return airplaneDelayTime;
	}
	
	//here is the method to set a delay to the aeroplane and be able to update the scheduledDeparture Time
	public void delayed(int minutes) {
		//assign the airplaneDelayTime to the delayed field above
		this.airplaneDelayTime = minutes;
		//now so we can update the scheduledDeparture time by adding on the delayed minutes time
		this.airplaneScheduledDeparture = this.airplaneScheduledDeparture.plusMinutes(minutes);
	}
	
	//method for checking the airplane's flight status 
	public void checkAirplaneFlightStatus() {
		//to check if their is a delay on that flight - here we use an if statement I'll explain how it works
		/*if delayed time == 0 - a message will print telling the user that there is no delay
		 * if else - if the delayed time is not 0 - a message will print telling the user that there is a delay + by how many minutes */
		if (airplaneDelayTime == 0) {
			//so if there is no delay, a message will print saying the flight in on time
			System.out.println("Flight: " + airplaneFlightNumber + " to " + airplaneDestination + " is on schedule");
		}
		else {
			//else if the flight is delayed, this message below will print out
			System.out.println("Flight: " + airplaneFlightNumber + " to " + airplaneDestination + " is delayed. It is delayed by " + airplaneDelayTime + " minutes. We apologise for the delay.");
		}
		
	}
}