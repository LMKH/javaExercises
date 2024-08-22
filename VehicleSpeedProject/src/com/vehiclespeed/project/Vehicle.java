package com.vehiclespeed.project;

//Vehicle superclass
public class Vehicle {
	//creating an attribute to hold the vehicle kind, so either bike or car
	//and one to hold the vehicle speed.
	public String vehicleKind;
	public int vehicleSpeed;
	
	//constructor to initialise the Vehicle superclass and its attributes and set them to their parameters
	public Vehicle(String vehicleKind, int vehicleSpeed) {
		this.vehicleKind = vehicleKind;
		this.vehicleSpeed = vehicleSpeed;
	}
	
	//getter and setter methods
	public String getVehicleKind() {
		return vehicleKind;
	}

	public void setVehicleKind(String vehicleKind) {
		this.vehicleKind = vehicleKind;
	}

	public int getVehicleSpeed() {
		return vehicleSpeed;
	}

	public void setVehicleSpeed(int vehicleSpeed) {
		this.vehicleSpeed = vehicleSpeed;
	}
	
	//vehicle speed up method - here is where we can increase the vehicles speed differently from one another.
	public void vehicleSpeedUp() {
		System.out.println("The kind of vehicle chosen is a - " + vehicleKind);
	}
}