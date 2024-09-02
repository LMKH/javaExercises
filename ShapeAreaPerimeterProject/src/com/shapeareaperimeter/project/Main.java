package com.shapeareaperimeter.project;

public class Main {

	public static void main(String[] args) {
		//creating a variable to hold the circle radius
		double radiusOfCircle = 10.0;
		//now creating an instance of the radius within the circle class
		Circle circle = new Circle(radiusOfCircle);
		
		//printing out to the console the radius, the area and the perimeter of the circle
		System.out.println("Here is the radius of the circle - " + radiusOfCircle);
		System.out.println("Here is the area of the circle - " + circle.getShapeArea());
		System.out.println("Here is the perimeter of the circle - " + circle.getShapePerimeter());
		System.out.println(); //for space
		
		//next, for the rectangle. only need 2 sides, as the 2 double equally.
		//variable for side1 of the rectangle
		double rectangleSideOne = 18.0;
		//variable for side2 of the rectangle
		double rectangleSideTwo = 24.0;
		//creating an instance of the rectangle with the 2 sides 
		Rectangle rectangle = new Rectangle(rectangleSideOne, rectangleSideTwo);
		
		//printing out to the console the sides, the area and the perimeter of the rectangle.
		System.out.println("Here are the sides of the rectangle - ");
		System.out.println("Rectangle side one: " + rectangleSideOne);
		System.out.println("Rectangle side two: " + rectangleSideTwo);
		System.out.println("The area of the rectangle is - " + rectangle.getShapeArea());
		System.out.println("The perimeter of the rectangle is - " + rectangle.getShapePerimeter());
		System.out.println();
		
		//finally, for the triangle.
		//variables for each side of the triangle
		double triangleSOne = 7.0;
		double triangleSTwo = 11.0;
		double triangleSThree = 14.0;
		//creating an instance of the triangle with all 3 sides
		Triangle triangle = new Triangle(triangleSOne, triangleSTwo, triangleSThree);
		
		//printing out to the console the sides, area and perimeter of the triangle
		System.out.println("Here are the sides of the triangle - ");
		System.out.println("Triangle side one: " + triangleSOne);
		System.out.println("Triangle side two: " + triangleSTwo);
		System.out.println("Triangle side three: " + triangleSThree);
		System.out.println("The area of the triangle is - " + triangle.getShapeArea());
		System.out.println("The perimeter of the triangle is - " + triangle.getShapePerimeter());
		System.out.println();
	}
}