package com.vehiclespeed.project;

//bike subclass
public class Bike extends Vehicle{
	//attribute to hold the bikes speed
	int bikeSpeed;
	
	//constructor to initialise the bike subclass, it's attribute, and also to call the superclass' constructor to initialise the common attributes
	public Bike(String vehicleKind, int vehicleSpeed, int bikeSpeed) {
		//now calling the superclass constructor
		super(vehicleKind, vehicleSpeed);
		this.bikeSpeed = bikeSpeed;
	}
	
	//overriding the vehicleSpeedUp method, so that the bikeSpeed attribute can be included
	@Override
	public void vehicleSpeedUp() {
		super.vehicleSpeedUp();
		//adding the bikeSpeed attribute
		System.out.println("The bikes speed is increasing to " + bikeSpeed + " kilometers per hour.");
	}
}