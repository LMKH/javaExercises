package com.shapecalcarea.project;

//circle subclass extends to the shape superclass
public class Circle extends Shape{
	//an attribute for the circles radius
	public double circleRadius;
	
	//constructor to initialise the Circle subclass + its attribute
	public Circle(double circleRadius) {
		this.circleRadius = circleRadius;
	}
	
	//Overriding the drawShape method from the superclass
	@Override
	public void drawShape() {
		//each subclasses output here will be different, as it is printing to the console and letting the user know which shape is going to be drawn out
		System.out.println("Now drawing a Circle");
	}
	
	//overriding the calculateShapeArea method from the superclass. to calculate the area of the circle we return Math.PI then multiply by the circleRadius squared.
	public double calculateShapeArea() {
		return Math.PI * circleRadius * circleRadius;
	}
}