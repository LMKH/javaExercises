package com.circle.project;

public class Circle {
	//stores the radius of the circle
	private double radius;
	
	//Constructor - for the circle class. initialises the radius variable above.
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//getter & setter methods - respectively retrieves and sets the radius of the circle.
	public double getRadius() {
		//returns the value
		return radius;
	}
	
	public void setRadius(double radius) {
		//sets the variable to the parameter 
		this.radius = radius;
	}
	
	//here is the method to calculate and return the area of the circle
	//Math.PI - it is a static final double constant in Java. It is equivalent to Pi in Maths. i.e. 3.14159...
	//using Pi, times it by the radius twice, then return the result
	public double getArea() {
		return Math.PI * radius * radius;
	}
	//here is the method to calculate and return the circumference of the circle. 
	//in the code the '2' is used because the formula for the circumference includes multiplying by 2.
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}
