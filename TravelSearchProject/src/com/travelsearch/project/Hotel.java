package com.travelsearch.project;

public class Hotel {
	//declaring integer variable to hold the hotelsID 
	private int hotelsID;
	//declaring String variable to hold the hotelGuestName, 
	private String hotelGuestName;
	//declaring String variable to hold the hotelLocation, 
	private String hotelLocation;
	//declaring String variable to hold the hotelCheckInDate, 
	private String hotelCheckInDate;
	//declaring String variable to hold the hotelCheckOutDate, 
	private String hotelCheckOutDate;
	//declaring integer variable to hold the hotelTotalGuests, 
	private int hotelTotalGuests;
	//declaring double variable to hold the hotelPrice
	private double hotelPrice;
	//declaring a integer variable to hold the confirmationNumber
	private int confirmationNumber;
	
	//constructor to initialise hotel object and the above variables to their respective provided details
	public Hotel(int hotelsID, String hotelGuestName, String hotelLocation, String hotelCheckInDate, String hotelCheckOutDate, int hotelTotalGuests, double hotelPrice) {
		this.hotelsID = hotelsID;
		this.hotelGuestName = hotelGuestName;
		this.hotelLocation = hotelLocation;
		this.hotelCheckInDate = hotelCheckInDate;
		this.hotelCheckOutDate = hotelCheckOutDate;
		this.hotelTotalGuests = hotelTotalGuests;
		this.hotelPrice = hotelPrice;
	}
	
	//now to get + return everything 
	public int getHotelsID() {
		return hotelsID;
	}
	
	public String getHotelGuestName() {
		return hotelGuestName;
	}
	
	public String getHotelLocation() {
		return hotelLocation;
	}
	
	public String getHotelCheckInDate() {
		return hotelCheckInDate;
	}
	
	public String getHotelCheckOutDate() {
		return hotelCheckOutDate;
	}
	
	public int getHotelTotalGuests() {
		return hotelTotalGuests;
	}
	
	public double getHotelPrice() {
		return hotelPrice;
	}
	
	public int getConfirmationNumber() {
		return confirmationNumber;
	}
	
	//finally, to set the confirmation number
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
}
}