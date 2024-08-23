package com.calculateshape.project;

public class Rectangle extends Shape{
	//attribute for the Rectangle shapes area
	double rectangleArea;
	
	//constructor to initialise the rectangle subclass, and call the superclass' Shape constructor
	public Rectangle(String shapeName, double rectangleArea) {
		//call superclass
		super(shapeName);
		this.rectangleArea = rectangleArea;
	}
	
	//overriding the superclass calculateShapeArea method
	@Override
	public void calculateShapeArea() {
		//calculating the rectangles area
		double calRectanglesArea = Math.PI * rectangleArea * rectangleArea;
		//returning the calculated rectangle area
		System.out.println("The area of the " + shapeName + " is " + calRectanglesArea);
	}
}