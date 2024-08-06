package com.gymmembership.project;

public class Main {

	public static void main(String[] args) {
		//creating an instance of the GymMembership with a base charge member - i.e. dosen't have access to premium extras
		//gym members name, membership type and duration
		GymMembership baseChargeMember = new GymMembership("Joanne Webster", "Monthly", 6);
		
		//creating an instance of the PremiumMembership with a premium charge member
		//gym members name, membership type and duration + personal trainer availability and gym spa access - true = yes
		PremiumMembership premiumChargeMember = new PremiumMembership("Gabrielle May", "Annual", 12, true, true);
		
		//displaying the information of the base charge membership
		System.out.println("Here is all the base membership information");
		baseChargeMember.displayGymMembershipInformation();
		
		//displaying the information of the premium membership
		System.out.println("\nHere is all the premium membership information");
		premiumChargeMember.displayGymMembershipInformation();
	}
}