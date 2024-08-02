package com.shape.project;

public class Main {

	public static void main(String[] args) {
		//now to actually create the shapes 
		//firstly, create a rectangle with the length set at 17 and the width at 20
		Shape rectangle = new Rectangle(17, 20);

		//next the radius of the circle set at 15
		Shape circle = new Circle(15);
		
		//and finally a triangle with different length sides
		Shape triangle = new Triangle(16, 18, 19);
		
		//to print out a header to the console
		System.out.println("Below are the area and perimeters of different shapes");
		
		//printing out the info and calculation for rectangle shape
		System.out.println("\nRectangle - Length: 17, Width: 20");
		System.out.println("Area of the Rectangle: " + rectangle.getAreaOfShape());
		System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeterOfShape());
		
		//printing out the info and calculation for circle shape
		System.out.println("\nCircle - Radius: 15");
		System.out.println("Area of the Circle: " + circle.getAreaOfShape());
		System.out.println("Perimeter of the Circle: " + circle.getPerimeterOfShape());
		
		//printing out the info and calculation for triangle shape
		System.out.println("\nTriangle - Side One: 16, Side Two: 18, Side Three: 19");
		System.out.println("Area of the Triangle: " + triangle.getAreaOfShape());
		System.out.println("Perimeter of the Triangle: " + triangle.getPerimeterOfShape());
	}
}