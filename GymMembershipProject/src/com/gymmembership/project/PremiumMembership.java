package com.gymmembership.project;

public class PremiumMembership extends GymMembership{
	//new additional attributes created for the PremiumMembership subclass - this is for personal trainer availability and gym spa access
	boolean personalTrainerAvailability;
	boolean gymSpaAccess;
	
	//constructor to initialise the PremiumMembership subclass + the new attributes + call the superclass's constructor to initialise the common attributes
	public PremiumMembership(String gymMemberName, String gymMembershipType, int gymMembershipDuration, boolean personalTrainerAvailability, boolean gymSpaAccess) {
		//calls the superclass's constructor
		super(gymMemberName, gymMembershipType, gymMembershipDuration);
		this.personalTrainerAvailability = personalTrainerAvailability;
		this.gymSpaAccess = gymSpaAccess;
	}
	
	//Override the calculateGymMembershipCharge() method to include the additional PremiumMembership charges
	@Override
	public double calculateGymMembershipCharge() {
		//calls the superclass method to get the base charge
		double baseCharge = super.calculateGymMembershipCharge();
		//adds additional charges if personalTrainerAvailability & gymSpaAccess are true
		//set to £0 at first then added to if booleans are true
		double additionalCharge = 0.0;
		
		//if statement - to see if the booleans personalTrainerAvailability & gymSpaAccess are true.
		//if either one or both return true add the additional charge
		
		//if personal Trainer is true add the additional monthly charge - an extra £25
		if (personalTrainerAvailability) {
			additionalCharge += 25.0 * gymMembershipDuration;
		}
		//if spa access is true add the additional monthly charge - an extra £15
		if (gymSpaAccess) {
			additionalCharge += 15.0 * gymMembershipDuration;
		}
		//return the original base charge of £19.99. Then, if the user is paying for the PremiumMembership extras add them onto the base charge with additionalCharge
		return baseCharge + additionalCharge;
	}
	
	//now to override the superclass method - displayGymMembershipInformation().
	//this is to include the PremiumMembership attributes - personalTrainerAvailability & gymSpaAccess information
	@Override
	public void displayGymMembershipInformation() {
		super.displayGymMembershipInformation();
		//ternary conditional operator - basically short hand 'if else'.
		System.out.println(gymMemberName + " would you like a personal trainer? " + (personalTrainerAvailability ? "Yes" : "No"));
		System.out.println(gymMemberName + " would you like access to our spa? " + (gymSpaAccess ? "Yes" : "No"));
	}
}