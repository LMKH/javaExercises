package com.buildings.project;

public class Building {
	//creating private attributes for the building class; building address, number of floors & total area
	public String buildingAddress;
	public int buildingNumberOfFloors;
	public double buildingTotalArea;
	
	//constructor to initialise the building object + the attributes the their respective parameters
	public Building(String buildingAddress, int buildingNumberOfFloors, double buildingTotalArea) {
		this.buildingAddress = buildingAddress;
		this.buildingNumberOfFloors = buildingNumberOfFloors;
		this.buildingTotalArea = buildingTotalArea;
	}
	
	//method for printing out to the console the building information 
	public void displayBuildingInformation() {
		System.out.println("The buildings address is " + buildingAddress + ".");
		System.out.println("The building has a total of " + buildingNumberOfFloors + " floors.");
		System.out.println("The building has a total area of " + buildingTotalArea + " sqare meters.");
	}
}