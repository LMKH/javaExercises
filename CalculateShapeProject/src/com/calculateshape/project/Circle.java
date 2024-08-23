package com.calculateshape.project;

public class Circle extends Shape{
	//attribute for the circle shapes area
	double circleArea;
	
	//constructor to initialise the circle subclass, and call the superclass' Shape constructor
	public Circle(String shapeName, double circleArea) {
		//call superclass
		super(shapeName);
		this.circleArea = circleArea;
	}
	
	//overriding the superclass calculateShapeArea method
	@Override
	public void calculateShapeArea() {
		//Calculating the area of the circle
		//math.pi * circle area * circle area - math pi multiplied by the area twice 
		double calCircleArea = Math.PI * circleArea * circleArea;
		//returning the circle area
		System.out.println("The area of the " + shapeName + " is " + calCircleArea);
	}
}