package com.buildings.project;

public class Main {

	public static void main(String[] args) {
		//creating a ResidentialBuilding instance with the attributes: address, floor count, total area, number of flats & rent per flat
		ResidentialBuilding residentialBuilding = new ResidentialBuilding("74 ABBA Road", 8, 3000.0, 24, 800.0);
		
		//creating a CommercialBuilding instance with the attributes: address, floor count, total area, total office space & rent per square meter
		CommercialBuilding commercialBuilding = new CommercialBuilding("62 Beatles Lane", 27, 9000.0, 300.0, 5.0);
		
		//displaying the ResidentialBuilding info to the console
		System.out.println("The residential building information:");
		//extra space for readability 
		System.out.println("");
		residentialBuilding.displayBuildingInformation();
		
		//displaying the CommercialBuilding info to the console
		System.out.println("\nThe commercial building information:");
		//extra space for readability 
		System.out.println("");
		commercialBuilding.displayBuildingInformation();
	}
}