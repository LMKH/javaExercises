package com.vehicle.project;

//the car subclass extends to the vehicle class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class Car extends Vehicle{
	
	//creating a private attribute here to store the boot (TRUNK) size of the car
	//using "boot" here over "trunk" - just a matter of preference.
	private double carBootSize;
	
	//constructor to initialise the carBootSize attribute and the carBootSize object + call the constructor of the superclass (Vehicle)
	public Car(String vehicleManufacturer, String vehicleModel, int vehicleProductionYear, double carBootSize) {
		super(vehicleManufacturer, vehicleModel, vehicleProductionYear);
		this.carBootSize = carBootSize;
	}
	
	//now we need to override the displayVehicleInformation() method, which prints out to the console. we need to do this so that we can include the carBootSize alongside the other attributes.
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	//p.s. this is only specific to cars, not for trucks
	@Override 
	public void displayVehicleInformation() {
		//now it is calling the superclass method
		super.displayVehicleInformation();
		//now this information here will be added onto the end of the original displayVehicleInformation() method
		System.out.println("The vehicle model boot size is " + carBootSize + " litres.");
	}
	
	//getter & setter methods
	//getter method for the boot size + returns the value
	public double getCarBootSize() {
		return carBootSize;
	}
	
	//setter method for the boot size
	//updates the car boot size as long as the input is positive and correct
	public void setCarBootSize(double carBootSize) {
		if (carBootSize > 0) {
			this.carBootSize = carBootSize;
			//if statement - if car boot size is less than nothing i.e inputting a incorrect amount like -15,
			//it will result in an error message being displayed to the console. it must be a positive value and a correct type inputed
		} else {
			System.out.println("ERROR - Please input a correct value.");
		}
	}
}