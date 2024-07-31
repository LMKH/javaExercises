package com.trafficlight.project;

public class Main {

	public static void main(String[] args) {
		//firstly, create a new trafficLight object with the lightsColour as "red" with 25 seconds of durationTime
		TrafficLight lightsColour = new TrafficLight("Red", 25);
		
		//prints out if the traffic light is red
		System.out.println("The traffic light is set to Red: " + lightsColour.isRed());
		
		//prints out if the traffic light is yellow
		System.out.println("The traffic light is set to Yellow: " + lightsColour.isYellow());
		
		//prints out if the traffic light is green
		System.out.println("The traffic light is set to Green: " + lightsColour.isGreen());
		
		//changes and switches the traffic light to yellow 
		lightsColour.switchColour("Yellow");
		
		//prints out if the traffic light is yellow
		System.out.println("The traffic light is set to Yellow: " + lightsColour.isYellow());
		
		//now to print out the durationTime of the traffic light
		System.out.println("The duration time of the light is: " + lightsColour.getDurationTime());
		
		//the durationTime of the traffic light - set to 10 seconds
		lightsColour.setDurationTime(10);
		
		//changes and switches the traffic light to green
		lightsColour.switchColour("Green");
		
		//prints out if the traffic light is green
		System.out.println("The traffic light is set to Green: " + lightsColour.isGreen());
		
		//to print out the durationTime of the traffic light
		System.out.println("The duration time of the light is: " + lightsColour.getDurationTime());
		
		//the durationTime of the traffic light - set to 35 seconds
		lightsColour.setDurationTime(35);
	}
}