package com.shapecalcarea.project;

//square subclass extends to the shape superclass
public class Square extends Shape{
	//attributes for the square sides length
	//only need one attribute, squareSide. for simplicity, but also because a square must have equal sides all around.
	public double squareSide;
	
	//constructor to initialise the square subclass + its attribute
	public Square(double squareSide) {
		this.squareSide = squareSide;
	}
	
	//Overriding the drawShape method from the superclass
	@Override
	public void drawShape() {
		//printing to the console and letting the user know which shape is going to be drawn out
		System.out.println("Now drawing a Square");
	}
	
	//overriding the calculateShapeArea method from the superclass.
	public double calculateShapeArea() {
		//calculating the squares area by multiplying the squareSide's together
		return squareSide * squareSide;
	}
}