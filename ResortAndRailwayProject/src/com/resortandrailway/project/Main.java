package com.resortandrailway.project;
import java.time.LocalDate; // - is a class in java that represents a date without a time zone. no time or time zone - used for any-date based logic without needing the time of day

public class Main {

	public static void main(String[] args) {
		//creating a brand new resort reservation object - customer reservation id, name and date of reservation w/ hotel room number
		ResortReservation resortReservation = new ResortReservation("HO1984", "Winston Smith", LocalDate.of(2024, 9, 10), 49);
		//displaying the hotel ResortReservation information + status to the console 
		resortReservation.checkReservationInfoStatus();
		System.out.println();
		
		//now to modify + update the ResortReservation information - so updating Winston's reservation date + hotel room number
		resortReservation.updateReservation("Winston Smith", LocalDate.of(2024, 9, 15), 101);
		resortReservation.checkReservationInfoStatus();
		System.out.println();
		
		//creating a brand new railway reservation object - customer reservation id, name and date of reservation w/ train seat number
		RailwayReservation railwayReservation = new RailwayReservation("TR1970", "Reginald Dwight", LocalDate.of(2024, 8, 18), 77);
		//displaying the train seat Reservation information + status to the console 
		railwayReservation.checkReservationInfoStatus();
		System.out.println();
		
		//now to modify + update the railway reservation information - so updating Reginald's reservation date + train seat number
		railwayReservation.updateReservation("Reginald Dwight", LocalDate.of(2024, 8, 20), 109);
		railwayReservation.checkReservationInfoStatus();
		System.out.println();
	}
}