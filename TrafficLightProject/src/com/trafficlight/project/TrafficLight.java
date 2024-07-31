package com.trafficlight.project;

public class TrafficLight {

	//private String variable stores the traffic lights colour
	private String colour;
	
	//private integer variable stores the duration time that the traffic light stays on a certain colour
	private int durationTime;
	
	//constructor initialises the above attributes and sets them to their respective parameters
	public TrafficLight(String colour, int durationTime) {
		this.colour = colour;
		this.durationTime = durationTime;
	}
	
	//method to change the colour of the traffic lights - using switchColour we can update the colour of the traffic light to a new colour
	public void switchColour(String newColour) {
		colour = newColour;
	}
	
	//now we need to create methods to check if the traffic light is exactly red, yellow or green.
	//using booleans - the data type that checks if something is true or false.
	//we can check if the light is true or false - correct or not. 
	//if its true it will run, if not it will pass to the next boolean to be checked.
	public boolean isRed() {
		//it will return true if the light is red, if it is false it will pass to the next boolean
		return colour.equals("Red");
	}
	//equals - the equals method similar to the == but instead of comparing 2 integers it will compare 2 strings.
	//returns true if the strings are equal, returns false if they are not equal.
	public boolean isYellow() {
		//it will return true if the light is yellow, if it is false it will pass to the next boolean
		return colour.equals("Yellow");
	}
	public boolean isGreen() {
		//it will return true if the light is green, if it is false it will pass to the next boolean
		return colour.equals("Green");
	}
	
	//method to get the durationTime of the traffic light
	public int getDurationTime() {
		//here it returns the durationTime value
		return durationTime;
	}
	
	//method to set the durationTime of the traffic light
	public void setDurationTime(int durationTime) {
		//here it updates the durationTime variable to a new value
		this.durationTime = durationTime;
	}
}