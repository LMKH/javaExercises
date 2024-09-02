package com.shapeareaperimeter.project;

//subclass extends to the Shape superclass 
class Triangle extends Shape{
	//creating variable attributes to hold each side of the triangle 
	private double triangleSideOne;
	private double triangleSideTwo;
	private double triangleSideThree;
	
	//initialising the Triangle subclass and its attributes to their respective parameters
	public Triangle(double triangleSideOne, double triangleSideTwo, double triangleSideThree) {
		this.triangleSideOne = triangleSideOne;
		this.triangleSideTwo = triangleSideTwo;
		this.triangleSideThree = triangleSideThree;
	}
	
	//overriding both superclass methods
	//overriding the getShapeArea() method.
	@Override
	public double getShapeArea() {
		//this line calculates the semi perimeter of the triangle. the semi perimeter is half of the perimeter of the triangle, which is the sum of the three side lengths divided by 2.
		double totalSides = (triangleSideOne + triangleSideTwo + triangleSideThree) / 2;
		//this line utilising Herons Formula - which is a formula used to calculate the area of triangles, when you know the lengths of all 3 sides
		//math.sqrt() - is a method that returns the square root of a number.
		//totalSides - is the semi perimeter of the triangle
		return Math.sqrt(totalSides * (totalSides - triangleSideOne) * (totalSides - triangleSideTwo) * (totalSides - triangleSideThree));
	}
	
	//overriding the getShapePerimeter() method. 
	public double getShapePerimeter() {
		//by totalling up each side we return the perimeter 
		return triangleSideOne + triangleSideTwo + triangleSideThree;
	}
}