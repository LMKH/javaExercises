package com.shapecalcarea.project;

//triangle subclass extends to the shape superclass
public class Triangle extends Shape{
	//attributes for the triangles three sides
	public double triangleSide1;
	public double triangleSide2;
	public double triangleSide3;
	
	//constructor to initialise the triangle subclass + its attributes.
	public Triangle(double triangleSide1, double triangleSide2, double triangleSide3) {
		this.triangleSide1 = triangleSide1;
		this.triangleSide2 = triangleSide2;
		this.triangleSide3 = triangleSide3;
	}
	
	//calculating the semi-perimeter of the triangle to in-turn get the area if the triangle.
	private double getTrianglePerimeter() {
		//taking each side of the triangle and then half them each - as the semi perimeter is half of the triangles perimeter
		return (triangleSide1 + triangleSide2 + triangleSide3) / 2;
}

	//Overriding the drawShape method from the superclass
	@Override
	public void drawShape() {
		//printing to the console and letting the user know which shape is going to be drawn out
		System.out.println("Now drawing a Triangle");
	}
	
	//overriding the calculateShapeArea method from the superclass.
	//returning the calculated triangle area from the above calculation
	public double calculateShapeArea() {
		double triangleSemiPerimeter = getTrianglePerimeter();
		//calculating the area using herons formula - used to find the area of a triangle when all three sides lengths are known
		//math.sqrt - returns the square root
		return Math.sqrt(triangleSemiPerimeter * (triangleSemiPerimeter - triangleSide1) * (triangleSemiPerimeter - triangleSide2) * (triangleSemiPerimeter - triangleSide3));
	}		
}