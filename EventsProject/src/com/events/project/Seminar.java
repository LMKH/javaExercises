package com.events.project;
import java.util.Date; //first import java.util.Date - this class represents the date and time in java. it provides constructors and methods to deal with date and time in java

//the Seminar subclass extends to the Event class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class Seminar extends Event{
	
	//declaring the seminar attribute for the number of seminar speakers 
	int numberOfSeminarSpeakers;
	
	//constructor to initialise the seminar attribute and the seminar class + call the constructor of the superclass (Event)
	public Seminar(String eventName, Date eventDate, String eventLocation, int numberOfSeminarSpeakers) {
		//call the superclass's constructor
		super(eventName, eventDate, eventLocation);
		this.numberOfSeminarSpeakers = numberOfSeminarSpeakers;
	}
	
	//override the displayEventInformation() method. need to do this so that we can include the numberOfSeminarSpeakers alongside the other attributes. this is for Seminar ONLY. 
	@Override
	public void displayEventInformation() {
		super.displayEventInformation();
		//now this seminar addition will be added to the console
		System.out.println("We are expecting there to be " + numberOfSeminarSpeakers + " speakers at this seminar.");
	}
}