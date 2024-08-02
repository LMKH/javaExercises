package com.shape.project;

//Triangle class extends to the abstract shape class
public class Triangle extends Shape{
	
	//3 private fields to store each side of the triangle 
	private double triangleSideOne;
	private double triangleSideTwo;
	private double triangleSideThree;
	
	//constructor to initialise each of the side of the triangle
	public Triangle(double triangleSideOne, double triangleSideTwo, double triangleSideThree) {
		this.triangleSideOne = triangleSideOne;
		this.triangleSideTwo = triangleSideTwo;
		this.triangleSideThree = triangleSideThree;
	}
	
	//method to calculate + return the area of the triangle shape 
	public double getAreaOfShape() {
		//calculating the Semi-Perimeter - take each side together then half them 
		//the semi-perimeter is half of the the triangle perimeter
		double semiPerimeter = (triangleSideOne + triangleSideTwo + triangleSideThree) / 2;
		
		//calculating the area using Herons formula - 
		//a mathematical formula used to find the area of a triangle when the lengths of all three sides are known.
		
		//math.sqrt - returns the square root
		return Math.sqrt(semiPerimeter * (semiPerimeter - triangleSideOne) * (semiPerimeter - triangleSideTwo) * (semiPerimeter - triangleSideThree));
	}
	
	//finally the method to calculate + return the perimeter of the triangle shape
	//we get the perimeter result by summing all three sides 
	public double getPerimeterOfShape() {
		return triangleSideOne + triangleSideTwo + triangleSideThree;
	}
}