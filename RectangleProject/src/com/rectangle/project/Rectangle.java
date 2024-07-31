package com.rectangle.project;

public class Rectangle {
	//'double' - primitive type, double-precision floating point.
	//private variables to store both the widths and heights of the rectangle. 
	//the 'private' keyword is an access modifier used for attributes, methods and constructors. This means they are only accessible within the declared class.
	private double width;
	private double height;
	
	//constructor - a constructor is a block of code that initialises the state and value during object creation.
	//so it will initialise the width and height variables of the rectangle
	//the 'public' keyword is an access modifier used for attributes, methods and constructors. This means they are accessible by any other class.
	public Rectangle(double width, double height) {
		//setting the width variable to the width parameter
		//'this' keyword - refers to the current object in a method or constructor.
		this.width = width;
		this.height = height;
	}
	
	//the use of 'get'. the 'get' method returns the variable value. so here is where we get the value of 'width' returned. 'set' sets the value.
	//here we retrieve and set the widths of the rectangle.
	public double getWidth(){
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	//here we retrieve and set the heights of the rectangle.
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//calculation - here we calculate and return the area of the rectangle.
	//we do this by multiplying the width and height
	public double getArea() {
		return width * height;
	}
	//getArea and getPerimeter are two methods that are used to calculate the area and perimeter of the rectangle
	public double getPerimeter() {
		return 2 * (width + height);
	}
}