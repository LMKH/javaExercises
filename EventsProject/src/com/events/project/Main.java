package com.events.project;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//creating an eventDate instance
		Date eventDate = new Date();
		
		//creating an instance of the seminar class - seminar name, date, location & number of speakers 
		Seminar seminar = new Seminar("A Talk About Planets", eventDate, "The Grand Theatre", 7);
		
		//creating an instance of the MusicalPerformance class - a list with 4 performers 
		List<String> musicalPerformers = new ArrayList<>();
		musicalPerformers.add("Rihanna");
		musicalPerformers.add("Grace Jones");
		musicalPerformers.add("Cher");
		musicalPerformers.add("SZA");
		//musical Performance performance name, date, location & the list of performers
		MusicalPerformance musicalPerformance = new MusicalPerformance("A Performance of the Greats", eventDate, "The Arena", musicalPerformers);
		
		//displaying the information for the seminar
		System.out.println("Here are all the details for the next seminar: ");
		seminar.displayEventInformation();
		
		//displaying the information for the MusicalPerformance
		System.out.println("\nHere are all the details for the next musical performance: ");
		musicalPerformance.displayEventInformation();
		
		//finally to check if the events clash
		//if they do - print a warning message letting the user know. if they don't a 'no clash' message will display
		if (seminar.isClashing(musicalPerformance)) {
			System.out.println("\nAttention - these 2 events are going to clash. They are booked at the same time and/or location.");
		} else {
			System.out.println("\nNo clashing times and/or locations detected.");
		}
	}
}