package com.shape.project;

//defining the rectangle class which extends the shape class
//to do this, i wrote "extends Shape" after the "public class Rectangle"

public class Rectangle extends Shape {
	//here is where I create private fields to store the length and width of the shape
	private double length;
	private double width;
	
	//constructor to initialise both the width and length of the rectangle shape.
	//setting both fields to their respective parameters.
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//now for the methods to calculate + return the area of the rectangle shape.
	//the following will multiply the rectangles length by its width - returning the rectangles area.
	public double getAreaOfShape() {
		return length * width;
	}
	
	//finally the method to calculate + return the perimeter of the rectangle shape.
	//the following will calculate the perimeter by using the formula 2 * (length + width)
	// "2 *" Multiplies the sum by 2
	public double getPerimeterOfShape() {
		return 2 * (length + width);
	}
}