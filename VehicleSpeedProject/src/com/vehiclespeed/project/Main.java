package com.vehiclespeed.project;

public class Main {

	public static void main(String[] args) {
		//creating new instances of both car speed and bike speed
		Car car = new Car("Car", 80, 80);
		Bike bike = new Bike("Bike", 16, 16);
		
		//now adding those instances to the vehicle speed up method
		car.vehicleSpeedUp();
		System.out.println();
		bike.vehicleSpeedUp();
	}
}