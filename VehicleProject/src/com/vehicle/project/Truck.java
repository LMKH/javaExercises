package com.vehicle.project;

//the truck subclass extends to the vehicle class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class Truck extends Vehicle{
	
	//creating a private attribute here to store the pay-load capacity of the truck
	private double truckPayLoadCapacity;
	
	//constructor to initialise the truck object and assign the truckPayLoadCapacity attribute to its respective parameter
	//+ call the constructor of the superclass (Vehicle)
	public Truck(String vehicleManufacturer, String vehicleModel, int vehicleProductionYear, double truckPayLoadCapacity) {
		super(vehicleManufacturer, vehicleModel, vehicleProductionYear);
		this.truckPayLoadCapacity = truckPayLoadCapacity;
	}
	
	//now we need to override the displayVehicleInformation() method, which prints out to the console. we need to do this so that we can include the truckPayLoadCapacity alongside the other attributes.
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	//p.s. this is only specific to trucks, not for cars
	@Override
	public void displayVehicleInformation() {
		super.displayVehicleInformation();
		System.out.println("The vehicle model pay load capacity is " + truckPayLoadCapacity + " tons.");
	}
	
	//getter & setter methods 
	//getter method for the pay load capacity + returns the value
	public double getTruckPayLoadCapacity() {
		return truckPayLoadCapacity;
	}
	
	//setter method for the pay load capacity 
	//updates the truck Pay Load Capacity as long as the input is positive and correct
	public void setTruckPayLoadCapacity(double truckPayLoadCapacity) {
		if (truckPayLoadCapacity > 0) {
			this.truckPayLoadCapacity = truckPayLoadCapacity;
			//if statement - if truckPayLoadCapacity is less than nothing i.e inputting a incorrect amount like -36,
			//it will result in an error message being displayed to the console. it must be a positive value and a correct type inputed
		} else {
			System.out.println("ERROR - Please input a correct value.");
		}
	}
}