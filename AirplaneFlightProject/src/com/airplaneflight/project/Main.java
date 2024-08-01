package com.airplaneflight.project;
//firstly, i need to import the LocalTime class from the java.time package
//local time class represents time in an hour-minute-second format
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		//creating new Airplane objects. in them will be the flights number, the flights destination, and the departure time - for example 15:30 would be (15, 30)
		//LocalTime.of - hour and minute, returns the time on these values
		Airplane flight1 = new Airplane("LAY824", "Reykjavík", LocalTime.of(16, 0));
		Airplane flight2 = new Airplane("JKQ447", "Anchorage", LocalTime.of(5, 30));
		Airplane flight3 = new Airplane("IAX625", "Munich", LocalTime.of(17, 25));
		Airplane flight4 = new Airplane("SHB730", "Tokyo", LocalTime.of(12, 40));
		Airplane flight5 = new Airplane("QFY391", "Lagos", LocalTime.of(20, 10));
		Airplane flight6 = new Airplane("RWJ089", "Cape Town", LocalTime.of(10, 50));
		
		//now to print out the flight statuses - this one is the initial flight status
		System.out.println("Status of our flights: ");
		//checks and prints the status of each flight
		flight1.checkAirplaneFlightStatus();
		flight2.checkAirplaneFlightStatus();
		flight3.checkAirplaneFlightStatus();
		flight4.checkAirplaneFlightStatus();
		flight5.checkAirplaneFlightStatus();
		flight6.checkAirplaneFlightStatus();
		
		//now to delay some of the flights
		//delaying flight 3 by 30 minutes
		flight3.delayed(30);
		//delaying flight 4 by 25 minutes 
		flight4.delayed(25);
		//delaying flight 6 by 50 minutes
		flight6.delayed(50);
		
		//now to print out the updated status of each flight
		System.out.println("\nAn update on the status of our flights: ");
		//checks and prints the status of each flight
		flight1.checkAirplaneFlightStatus();
		flight2.checkAirplaneFlightStatus();
		flight3.checkAirplaneFlightStatus();
		flight4.checkAirplaneFlightStatus();
		flight5.checkAirplaneFlightStatus();
		flight6.checkAirplaneFlightStatus();
	}
}