package com.shape.project;
//abstract class - is a restricted class that cannot be used to create objects.
//to have access to this abstract class, it must be inherited from another class.

//since this class is abstracted, it can not be instantiated on its own.
//it provides a framework for other classes to extend and implement its methods

public abstract class Shape {
	//to get the area of the shape, we use the abstract method
	//abstract method - can only be used in an abstract class, and it does not have a body.
	//an abstract class can have both abstract and regular methods inside of it.
	public abstract double getAreaOfShape();
	
	//another abstract method used in order to get the perimeter of the shape
	//both methods used here, must also be used by any subclass of Shape
	public abstract double getPerimeterOfShape();
}