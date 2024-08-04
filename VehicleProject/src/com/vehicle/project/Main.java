package com.vehicle.project;

public class Main {

	public static void main(String[] args) {
		//creating a brand new car object 
		Car car = new Car("Vauxhall", "Astra", 2003, 330);
		//print out the vehicle information to the console
		car.displayVehicleInformation();
		
		//creating a brand new truck object
		Truck truck = new Truck("Mercedes-Benz", "Sprinter", 2021, 16.6);
		//print out the vehicle information to the console
		truck.displayVehicleInformation();
	}
}