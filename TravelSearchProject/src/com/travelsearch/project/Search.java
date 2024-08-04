package com.travelsearch.project;
//import java.util.ArrayList - for arrays
//import java.util.Random - for generating random numbers in java.
import java.util.ArrayList;
import java.util.Random;

public class Search {
	//declaring array lists to store flights and hotels 
	private ArrayList<Flight> flights;
	private ArrayList<Hotel> hotels;
	
	//constructor to initialise the above array lists
	public Search() {
		this.flights = new ArrayList<>();
		this.hotels = new ArrayList<>();
	}
	
	//method for searching flights
	//flightOrigin - where the flight has came from, flightDestination - where the flight is going, flightDate - date of flight, flightTotalPassangers - total amount of passengers on the flight
	public void searchFlights(String flightOrigin, String flightDestination, String flightDate, int flightTotalPassangers) {
		//printing to the console the search information for the flight
		System.out.println("We're finding you the best flights from " + flightOrigin + " to " + flightDestination + " on " + flightDate + " for " + flightTotalPassangers + " passengers. Hold tight!");
	}
	
	//method for searching hotels
	//hotelLocation - where the hotel is, hotelCheckIn/OutDate - days to check in & out, hotelTotalGuests - how many guests are going to the hotel
	public void searchHotels(String hotelLocation, String hotelCheckInDate, String hotelCheckOutDate, int hotelTotalGuests) {
		//printing to the console the search information for the hotel
		System.out.println("\nWe're finding you the finest hotels in " + hotelLocation + " from " + hotelCheckInDate + " till " + hotelCheckOutDate + " for " + hotelTotalGuests + " guests. Just a moment!");
	}
	
	//method for booking a flight
	public void bookAFlight(int flightNumberIndex, String flightPassengerName, String flightOrigin, String flightDestination, String flightDate, int flightTotalPassangers, double flightPrice) {
		//creating a brand new flight object with the following information
		Flight flight = new Flight(flightNumberIndex, flightPassengerName, flightOrigin, flightDestination, flightDate, flightTotalPassangers, flightPrice);
		
		//generating a brand new flight confirmation number 
		int confirmationNumber = genConfirmationNumber();
		//setting the generated flight ConfirmationNumber
		flight.setConfirmationNumber(confirmationNumber);
		
		//add the created flight to the flights array list 
		this.flights.add(flight);
		
		//printing out a confirmation message to the console
		System.out.println("\nCongratulations! Your flight to " + flightDestination + " from " + flightOrigin + " has been successfully booked. Here is your flight confirmation number: " + confirmationNumber);
	}
	
	//method for booking a hotel
	public void bookAHotel(int hotelsID, String hotelGuestName, String hotelLocation, String hotelCheckInDate, String hotelCheckOutDate, int hotelTotalGuests, double hotelPrice) {
		//creating a brand new hotel object with the following information
		Hotel hotel = new Hotel(hotelsID, hotelGuestName, hotelLocation, hotelCheckInDate, hotelCheckOutDate, hotelTotalGuests, hotelPrice);
		
		//generating a new hotel confirmation number
		int confirmationNumber= genConfirmationNumber();
		//setting the generated hotelConfirmationNumber
		hotel.setConfirmationNumber(confirmationNumber);
		
		//add the created hotel to the hotels array list
		this.hotels.add(hotel);
		
		//printing out a confirmation message to the console
		System.out.println("\nGreat news! Your hotel in " + hotelLocation + " has been successfully booked. Here is your hotel confirmation number: " + confirmationNumber);
	}
	
	//method for cancelling a flight reservation 
	public void cancelFlightReservation(int confirmationNumber) {
		//for loop - to loop through all the reservations till it finds the corresponding correct flightConfirmationNumber.
		for (Flight flight : this.flights) {
			//so when the for loop is running and it finds the corresponding correct flightConfirmationNumber, if it matches remove the reservation - using removeMethod()
			if (flight.getConfirmationNumber() == confirmationNumber) {
				//remove the flight reservation
				this.flights.remove(flight);
				//printing out a confirmation message to the console
				System.out.println("\nYour booked reservation on the flight to " + flight.getFlightDestination() + " has been cancelled. Here is your confirmation number: " + confirmationNumber + "\nWe're sorry to see you go! Make sure to fly again with us soon!");
				//then return
				return;
			}
		}
			//printing out a message if no reservation has been found with a provided reservation confirmation number assistance  
			System.out.println("\nWe're sorry, but the confirmation number you have provided - " + confirmationNumber + " - is not matching with anything on our system. "
					+ "\nPlease try again, or alternatively you can contact our support line if you need assistance!");
	}			
			
	//cancelling a hotel reservation
	//using a for loop, loop through all the hotel reservations until the correct ConfirmationNumber matches
	public void cancelHotelReservation(int confirmationNumber) {
		for (Hotel hotel : this.hotels) {
			//so when the for loop is running and it finds the corresponding correct hotelConfirmationNumber, if it matches remove the reservation - using removeMethod()
			if (hotel.getConfirmationNumber() == confirmationNumber) {
				//remove the hotel reservation
				this.hotels.remove(hotel);
				//printing out a confirmation message to the console
				System.out.println("Your booked hotel reservation in " + hotel.getHotelLocation() + " has been cancelled. Here is your confirmation number: " + confirmationNumber + "\nWe're sorry that you couldn't stay with us! Make sure to visit us again soon!");
				return;
			}
		}
		//printing out a message if no reservation has been found with a provided reservation confirmation number
		System.out.println("We're sorry, but the confirmation number you have provided - " + confirmationNumber + " is not matching with anything on our system. "
				+ "\nPlease contact our support line if you need help!");
}			
	
	//method for generating a random confirmation number
	private int genConfirmationNumber() {
		//creating a new random object
		Random randomNumber = new Random();
		//generate + return the new random confirm number
		return randomNumber.nextInt(900000) + 100000;
	}
}
