package com.vehicle.project;

public class Vehicle {
	//making private attributes for the different aspects of the vehicle 
	//for the vehicle manufacturer
	private String vehicleManufacturer;
	//for the vehicle model
	private String vehicleModel;
	//for the vehicle production year;
	private int vehicleProductionYear;
	
	//construction - to initialise the vehicle object and assign the variables to their respective parameters
	public Vehicle(String vehicleManufacturer, String vehicleModel, int vehicleProductionYear) {
		this.vehicleManufacturer = vehicleManufacturer;
		this.vehicleModel = vehicleModel;
		this.vehicleProductionYear = vehicleProductionYear;
	}
	
	//now the method to display the vehicle information -
	//prints out to the console the manufacturer, model & production year of the vehicle
	public void displayVehicleInformation() {
		System.out.println("\nHere is the information of the vehicle/s you have selected - ");
		System.out.println("\nThe manufacturer of the vehicle - " + vehicleManufacturer);
		System.out.println("The model of the vehicle - " + vehicleModel);
		System.out.println("The vehicle model year - " + vehicleProductionYear);
	}
	
	//getter method for the manufacturer + return the value
	public String getVehicleManufacturer() {
		return vehicleManufacturer;
	}
	
	//getter method for the vehicle model + return the value
	public String getVehicleModel() {
		return vehicleModel;
	}
	
	//getter method for the vehicle production year + return the value
	public int getVehicleProductionYear() {
		return vehicleProductionYear;
	}
}