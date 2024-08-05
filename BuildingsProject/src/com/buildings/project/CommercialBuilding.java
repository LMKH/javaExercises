package com.buildings.project;

//the CommercialBuilding subclass extends to the Building class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class CommercialBuilding extends Building{
	//creating new additional attributes for the CommercialBuilding class
	double commercialTotalOfficeSpace;
	double commercialRentPerSquareMeter;
	
	//constructor to initialise the CommercialBuilding attributes and the CommercialBuilding class + call the constructor of the superclass (Building)
	public CommercialBuilding(String buildingAddress, int buildingNumberOfFloors, double buildingTotalArea, double commercialTotalOfficeSpace, double commercialRentPerSquareMeter) {
		//calling the constructor of the superclass 
		super(buildingAddress, buildingNumberOfFloors, buildingTotalArea);
		this.commercialTotalOfficeSpace = commercialTotalOfficeSpace;
		this.commercialRentPerSquareMeter = commercialRentPerSquareMeter;
	}
	
	//method to calculate the total rent of the commercial building
	//so that'll be by the total office space * the rent per square meter, resulting in the total rent of that building being returned 
	public double calculateBuildingsTotalRent() {
		return commercialTotalOfficeSpace * commercialRentPerSquareMeter;
	}
	
	//now we need to override the displayBuildingInformation() method, which prints out to the console. 
	//we need to do this so that we can include the commercialTotalOfficeSpace & the commercialRentPerSquareMeter alongside the other attributes. this is for commercial buildings ONLY.
	@Override
	public void displayBuildingInformation() {
		super.displayBuildingInformation();
		//now we can add the CommercialBuilding attributes to the display
		System.out.println("The total office space this building has is " + commercialTotalOfficeSpace + " square meters.");
		System.out.println("The rent per square meter in this building is £" + commercialRentPerSquareMeter + ".");
		System.out.println("The total rent of an office in this building is £" + calculateBuildingsTotalRent() + ".");
	}
}