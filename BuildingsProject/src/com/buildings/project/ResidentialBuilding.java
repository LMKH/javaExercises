package com.buildings.project;

//the ResidentialBuilding subclass extends to the Building class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class ResidentialBuilding extends Building{
	//creating new additional attributes for the residentialBuilding class i.e. building number of flats and the rent per flat
	int numberOfFlats;
	double rentPerFlat;
	
	//constructor to initialise the residentialBuilding attributes and the residentialBuilding class + call the constructor of the superclass (Building)
	public ResidentialBuilding(String buildingAddress, int buildingNumberOfFloors, double buildingTotalArea, int numberOfFlats, double rentPerFlat) {
		//calls the superclass's constructor
		super(buildingAddress, buildingNumberOfFloors, buildingTotalArea);
		this.numberOfFlats = numberOfFlats;
		this.rentPerFlat = rentPerFlat;
	}
	
	//method to calculate the total rent of the residential building
	//so that'll be by the total number of flats * the rent per flat, resulting in the total rent of that building being returned 
	public double calculateBuildingsTotalRent() {
		return numberOfFlats * rentPerFlat;
	}
	
	//now we need to override the displayBuildingInformation() method, which prints out to the console. 
	//we need to do this so that we can include the numberOfFlats & the rentPerFlat alongside the other attributes. this is for residential buildings ONLY.
	
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	@Override
	public void displayBuildingInformation() {
		super.displayBuildingInformation();
		//now we can add the residentialBuilding attributes to the display
		System.out.println("The total amount of flats in this building is " + numberOfFlats + " flats.");
		System.out.println("The rent per flat is £" + rentPerFlat);
		System.out.println("The total rent of all flats in this building is £" + calculateBuildingsTotalRent());
	}
}