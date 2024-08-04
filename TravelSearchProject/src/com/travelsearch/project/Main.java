package com.travelsearch.project;

public class Main {

	public static void main(String[] args) {
		//creating a new Search object
		Search search = new Search();
		//searching for flights from Cape Town to Sydney on 2024/9/18 for 2 passengers
		search.searchFlights("Cape Town", "Sydney", "2024-9-18", 2);
		//searching for hotels in Tallinn between 2024/8/17 and 2024/8/31 for 4 guests
		search.searchHotels("Tallinn", "2024-8-17", "2024-8-31", 4);
		
		//booking a flight. flight number, customer name, flight origin, flight destination, flight date, number of passengers & finally price 
		search.bookAFlight(84566210, "Jerry Richardson", "Austin", "Madrid", "2024-9-07", 1, 820.00);
		
		//booking another flight. flight number, customer name, flight origin, flight destination, flight date, number of passengers & finally price 
		search.bookAFlight(71416793, "Sandra David", "Tokyo", "Seattle", "2024-9-02", 2, 1600.00);
		
		//booking another flight. flight number, customer name, flight origin, flight destination, flight date, number of passengers & finally price 
		search.bookAFlight(52478555, "Grace Williams", "Chicago", "Dublin", "2025-1-06", 3, 1800.00);
		
		//booking a hotel. hotelID, guest, hotel location, check in date, check out date, number of guests & price total
		search.bookAHotel(26008415, "John Addams", "Havana", "2024-9-12", "2024-9-23", 4, 2100.00);
		
		//to cancel a reservation - i.e. "Jerry Richardson's flight - cancel it with its respective flight confirmation number
		search.cancelFlightReservation(84566210);
	}
}