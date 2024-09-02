package com.shapeareaperimeter.project;

//subclass extends to the Shape superclass 
class Rectangle extends Shape{
	//attributes for the rectangles width and length
	private double rectangleWidth;
	private double rectangleLength;
	
	//initialising the rectangle subclass and its attributes to their respective parameters
	public Rectangle(double rectangleWidth, double rectangleLength) {
		this.rectangleWidth = rectangleWidth;
		this.rectangleLength = rectangleLength;
	}
	
	//overriding both superclass methods
	//overriding the getShapeArea() method. to get the correct area, we have to multiply the length by the width. this will return the shape area
	@Override
	public double getShapeArea() {
		return rectangleLength * rectangleWidth;
	}
	
	//Overriding the getShapePerimeter() method. the 2 accounts for both pairs of opposite sides
	//the 'length + width' calculates the sum of one pair of opposite sides. thats why it's multiplying this sum by 2 accounts for both pairs of sides in the rectangle
	public double getShapePerimeter() {
		return 2 * (rectangleLength + rectangleWidth);
	}
}