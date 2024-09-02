package com.shapeareaperimeter.project;

//subclass extends to the Shape superclass 
class Circle extends Shape{
	//attribute for the Circle subclass - here is where the radius for the circle will be held
	private double circleRadius;
	
	//constructor to initialise the subclass + its attribute
	public Circle(double circleRadius) {
		this.circleRadius = circleRadius;
	}
	
	//overriding both superclass methods
	//overriding the getShapeArea() method. to calculate the area of the circle we return Math.PI then multiply by the circleRadius squared.
	@Override
	public double getShapeArea() {
		return Math.PI * circleRadius * circleRadius;
	}
	
	//Overriding the getShapePerimeter() method. the 2 represents the diameter of the circle, which is twice the length of the radius.
	//so with 2 * the circle radius, and multiplying by PI we will return the perimeter of the circle.
	public double getShapePerimeter() {
		return 2 * Math.PI * circleRadius;
	}

}