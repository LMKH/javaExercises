package com.shapeareaperimeter.project;

//shape superclass
abstract class Shape {
	//no need for attributes in the superclass Shape. 
	//All that is needed here is the creation of 2 double methods, getShapeArea and getShapePermimeter.
	abstract double getShapeArea();
	abstract double getShapePerimeter();
}