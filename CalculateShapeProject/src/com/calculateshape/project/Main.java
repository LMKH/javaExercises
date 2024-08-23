package com.calculateshape.project;
public class Main {

	public static void main(String[] args) {
		//instances of circle, rectangle & triangle objects
		Circle circle = new Circle("Circle", 5.5);
		Rectangle rectangle = new Rectangle("Rectangle", 4.8);
		Triangle triangle = new Triangle("Triangle", 6.7);
		
		//finally to print out each respective shape with its area
		circle.calculateShapeArea();
		System.out.println();
		rectangle.calculateShapeArea();
		System.out.println();
		triangle.calculateShapeArea();
	}
}