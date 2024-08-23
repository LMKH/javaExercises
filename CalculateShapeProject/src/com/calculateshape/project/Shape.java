package com.calculateshape.project;

public class Shape {
	//Attribute for the name of the shape
	public String shapeName;
	
	//constructor to initialise the shape superclass and its attribute and set it to its parameter
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	//getter and setter methods
	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	//area of the shape method
	public void calculateShapeArea() {
		System.out.println("Please choose between Circle, Rectangle and Triangle.");
	}
}