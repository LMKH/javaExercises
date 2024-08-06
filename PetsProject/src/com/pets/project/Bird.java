package com.pets.project;

public class Bird extends Pet{
	//new additional attribute created for the Bird subclass - this is for the birds wing span
	double birdWingSpan;
	
	//constructor to initialise the Bird subclass + the new attribute + call the superclass's constructor to initialise the common attributes
	public Bird(String petName, int petAge, double birdWingSpan) {
		//call the superclass constructor
		//pets name, "Bird" so it can be checked in the if statement in the calculateToHumanYears() method, and finally the pets age
		super(petName, "Bird", petAge);
		this.birdWingSpan = birdWingSpan;
	}
	
	//now to Override the displayPetInformation() method - this is done to include the birdWingSpan attribute
	@Override
	public void displayPetInformation() {
		super.displayPetInformation();
		//now it will print out + display the following to the console
		System.out.println(petName + "'s wing span is - " + birdWingSpan + "cm");
	}
}