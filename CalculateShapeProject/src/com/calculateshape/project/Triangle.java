package com.calculateshape.project;

public class Triangle extends Shape{
	//attribute for the triangle shapes area
	double triangleArea;
	
	//constructor to initialise the triangle subclass, and call the superclass' Shape constructor
	public Triangle(String shapeName, double triangleArea) {
		//calling the superclass constructor
		super(shapeName);
		this.triangleArea = triangleArea;
	}
	
	//overriding the superclass calculateShapeArea method
	@Override
	public void calculateShapeArea() {
		//calculating the triangle area
		double calTriangleArea = Math.PI * triangleArea * triangleArea;
		//returning the calculated triangle area value
		System.out.println("The area of the " + shapeName + " is " + calTriangleArea);
	}
}