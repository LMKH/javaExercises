package com.shapecalcarea.project;

abstract class Shape {
	//abstract classes in java are classes that cannot be instantiated on their own. They are meant to be extended by other classes. 
	//This superclass does not define any attributes, because the subclasses handles their own respective attributes.
	//Abstract methods can only be used in an abstract class, and they do not have a body. The reason for this is, the body is being provided by the subclass.
	
	//the subclasses will implement the abstract methods below
	//first, the drawShape method
	public abstract void drawShape();
	
	//secondly, the calculateShapeArea method. 
	//double as we will be expecting a floating point number to be returned.
	public abstract double calculateShapeArea();
}