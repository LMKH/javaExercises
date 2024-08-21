package com.animalsounds.project;

public class Cat extends Animal{
	//attribute to store the Cat sound.
	String catSound;
	
	//constructor to initialise the cat subclass and its attribute 'catSound', and to call the superclass's constructor to initialise the common attributes
	public Cat(String animalSpecies, String animalSound, String catSound) {
		//calling the superclass constructor
		super(animalSpecies, animalSound);
		this.catSound = catSound;
	}
	
	//now to override the displayAnimalInformation method so the catSound attribute is included
	@Override
	public void displayAnimalInformation() {
		super.displayAnimalInformation();
		//now adding the catSound attribute
		System.out.println("The cat makes a " + catSound + " sound.");
	}
}