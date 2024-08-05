package com.events.project;
//first import java.util.Date - this class represents the date and time in java. it provides constructors and methods to deal with date and time in java
import java.util.Date;

public class Event {
	//declaring the event attributes; even name, date & location
	String eventName;
	Date eventDate;
	String eventLocation;
	
	//constructor to initialise the event class + assign the attributes the their respective parameters
	public Event(String eventName, Date eventDate, String eventLocation) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
	}
	
	//method to have the console print out the event information - prints out the event name, date and location
	public void displayEventInformation() {
		System.out.println("\nThe event is called '" + eventName + "'");
		System.out.println("The event will be held on " + eventDate);
		System.out.println("The event will be held at " + eventLocation);
	}
	
	//boolean is used here to check if the current event clashes with another event by comparing the dates & locations
	public boolean isClashing(Event anotherEvent) {
		//so check if this events date is clashing with another events date & the same for the location
		return this.eventDate.equals(anotherEvent.eventDate) && this.eventLocation.equals(anotherEvent.eventLocation);
	}
}