package com.rectangle.project;

public class Main {

	public static void main(String[] args) {
		//instance variable - these are non-static variables and are declared in a class outside any method, constructor or block.
		//instance variable of the rectangle class with width and height attributes. 
		Rectangle rectangle = new Rectangle(10, 18);
		
		//now we print out the area and the perimeter of the rectangle
		System.out.println("Area of the rectangle: " + rectangle.getArea());
		System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
		
		//setting new rectangle areas & perimeters using 'set'
		//new width & height
		rectangle.setWidth(12);
		rectangle.setHeight(20);
		
		//updated attributes - new area & perimeters
		System.out.println("The updated area of the rectangle: " + rectangle.getArea());
		System.out.println("The updated perimeter of the rectangle: " + rectangle.getPerimeter());
	}
}
