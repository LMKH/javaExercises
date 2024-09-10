package com.shapecalcarea.project;

public class Main {

	public static void main(String[] args) {
		//instance of Circle. with a radius of 15
		Shape circle = new Circle(15.0);
		//instance of Square. with all sides equal to 9
		Shape square = new Square(9.0);
		//instance of Triangle. with different length sides; side1 to 24.0, side2 to 14.0, and side3 to 8.0
		Shape triangle = new Triangle(24.0, 14.0, 8.0);
		
		//now to draw out each shape, by calling the variable with the drawShape method.
		//this will now print out to the console which shape is being drawn
		circle.drawShape();
		square.drawShape();
		triangle.drawShape();
		
		//calculating and displaying the area of each shape
		System.out.println("The area of the Circle is - " + circle.calculateShapeArea());
		System.out.println("The area of the Square is - " + square.calculateShapeArea());
		System.out.println("The area of the Triangle is - " + triangle.calculateShapeArea());
	}
}