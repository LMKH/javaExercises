package com.pets.project;

public class Dog extends Pet{
	//new additional attribute created for the Dog subclass - this is for the dogs favourite toy
	String dogsFavouriteToy;
	
	//constructor to initialise the Dog subclass + the new attribute + call the superclass's constructor to initialise the common attributes
	public Dog(String petName, int petAge, String dogsFavouriteToy) {
		//calls the superclass's constructor
		//pets name, "Dog" so it can be checked in the if statement in the calculateToHumanYears() method, and finally the pets age
		super(petName, "Dog", petAge);
		this.dogsFavouriteToy = dogsFavouriteToy;
	}
	
	//now to Override the displayPetInformation() method - this is done to include the dogsFavouriteToy attribute 
	@Override
	public void displayPetInformation() {
		super.displayPetInformation();
		//now it will print out + display the following to the console
		System.out.println(petName + "'s favourite toy is - " + dogsFavouriteToy);
	}
}