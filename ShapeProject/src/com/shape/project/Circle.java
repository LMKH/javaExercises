package com.shape.project;

//circle class extends to the abstract shape class
public class Circle extends Shape {
	
	//private field to store the circles radius;
	private double circleRadius;
	
	//constructor to initialise the circleRadius field and set it to the parameter
	public Circle(double circleRadius) {
		this.circleRadius = circleRadius;
	}
	
	//now the method to calculate + return the area of the circle shape.
	//Math.PI - as in 3.14159 etc. calculated by multiplying the square radius by PI
	public double getAreaOfShape() {
		return Math.PI * circleRadius * circleRadius; 
	}
	
	//finally, the method to calculate + return the perimeter of the circle shape.
	//the following will calculate the perimeter by multiplying the radius by PI twice
	// "2 *" Multiplies the sum by 2 
	public double getPerimeterOfShape() {
		return 2 * Math.PI * circleRadius;
	}
}