package com.events.project;
//import java.util.List - it is an ordered collection of objects in which duplicate values can be stored.
import java.util.List;
//import java.util.Date - this class represents the date and time in java. it provides constructors and methods to deal with date and time in java.
import java.util.Date;

//the MusicalPerformance subclass extends to the Event class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class MusicalPerformance extends Event{
	
	//declaring the MusicalPerformance attribute for the list of musical performers in a concert
	List<String> musicalPerformers;
	
	//constructor to initialise the MusicalPerformance attribute and the MusicalPerformance class + call the constructor of the superclass (Event)
	public MusicalPerformance(String eventName, Date eventDate, String eventLocation, List<String> musicalPerformers) {
		//calling the superclass's constructor 
		super(eventName, eventDate, eventLocation);
		this.musicalPerformers = musicalPerformers;
	}
	
	//override the displayEventInformation() method. need to do this so that we can include the musicalPerformers alongside the other attributes. this is for musical performance ONLY. 
	@Override
	public void displayEventInformation() {
		super.displayEventInformation();
		//now this MusicalPerformance addition will be added to the console
		//string.join(", ") - method concatenates the given elements with the delimiter (what's been placed in the brackets()) and returns the concatenated string.
		System.out.println("The performers at the concert are: "  + String.join(", ", musicalPerformers));
	}
}