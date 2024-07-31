package com.circle.project;

public class Main {

	public static void main(String[] args) {
		//first i will declare a variable integer, give it the name 'rad' for radius, and give it the value of 10
		int rad = 10;
		//next, I create an instance of the circle class with the radius
		Circle circle = new Circle(rad);
		
		//new line - \n has been placed throughout to space out the results of the console, so its easier to read.
		//to print out the radius of the circle to the console
		System.out.println("The radius of the circle is " + rad + ".");
		//next, to print out the area of the circle to the console
		System.out.println("\nThe area of the circle is " + circle.getArea() + ".");
		//lastly, to print out the circumference of the circle to the console
		System.out.println("\nThe circumference of the circle is " + circle.getCircumference() + "." );
		
		
		//now to update the radius variable (rad)
		rad = 20;
		//setting the updated radius to the new value
		circle.setRadius(rad);
		
		//now to print out the updated values, radius, area & circumference.
		//new line - \n has been placed the to space out the results of the console better
		System.out.println("\nThe updated radius of the circle is " + rad + ".");
		System.out.println("\nThe updated area of the circle is " + circle.getArea() + ".");
		System.out.println("\nThe updated circumference of the circle is " + circle.getCircumference() + ".");
	}
}