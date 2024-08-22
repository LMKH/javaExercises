package com.vehiclespeed.project;

//car subclass
public class Car extends Vehicle {
	//attribute to hold the cars speed
	int carSpeed;
	
	//constructor to initialise the car subclass, it's attribute, and also to call the superclass' constructor to initialise the common attributes
	public Car(String vehicleKind, int vehicleSpeed, int carSpeed) {
		//calling the superclass constructor
		super(vehicleKind, vehicleSpeed);
		this.carSpeed = carSpeed;
	}
	
	// now finally, to override the vehicleSpeedUp method, so that the carSpeed attribute can be included
	@Override
	public void vehicleSpeedUp() {
		super.vehicleSpeedUp();
		//including the carSpeed attribute
		System.out.println("The cars speed is increasing to " + carSpeed + " kilometers per hour.");
	}
}