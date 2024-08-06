package com.gymmembership.project;

public class GymMembership {
	//creating attributes for the GymMembership class, here is where the gym members name, membership type and duration will be held
	String gymMemberName;
	String gymMembershipType;
	int gymMembershipDuration;
	//the gymMembershipDuration will be displayed in months
	
	//constructor to initialise the GymMembership class and its attributes to their respective parameters
	public GymMembership(String gymMemberName, String gymMembershipType, int gymMembershipDuration) {
		this.gymMemberName = gymMemberName;
		this.gymMembershipType = gymMembershipType;
		this.gymMembershipDuration = gymMembershipDuration;
	}
	
	//the method to calculate up the gym membership charge
	public double calculateGymMembershipCharge() {
		//baseCharge - this represents the amount the gym membership costs per month. £19.99 a month.
		double baseCharge = 19.99;
		//returns the total charge by multiplying the base charge with the total gymMembershipDuration in months
		return baseCharge * gymMembershipDuration;
	}
	
	//the method to check for special offers 
	//checks if the membership type is 'annual' - if it is, it will display a message offering a 30% discount. if its any other membership, no offer will be displayed
	public String checkForSpecialOffers() {
		//.equalsIgnoreCase - this method compares two strings, ignoring lower case & upper case differences. the method returns true if the strings are equal, and false if not.
		if (gymMembershipType.equalsIgnoreCase("annual")) {
			return "We're excited to offer you a 30% discount on your annual membership with us!";
		} else {
			return "We have no offers for you right now. Check back soon!";
		}
	}
	
	//method to display all the gym membership information 
	//included - gym members name, membership type, duration. +  calculateGymMembershipCharge for monthly charge & checkForSpecialOffers for special offers
	public void displayGymMembershipInformation() {
		System.out.println("\nGym members' name - " + gymMemberName);
		System.out.println(gymMemberName + "'s membership type - " + gymMembershipType);
		System.out.println(gymMemberName + "'s membership duration - " + gymMembershipDuration);
		System.out.println(gymMemberName + "'s membership charge is £" + calculateGymMembershipCharge());
		System.out.println("Special offers for " + gymMemberName + ": " + checkForSpecialOffers());
	}
}