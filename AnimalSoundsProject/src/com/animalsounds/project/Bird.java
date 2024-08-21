package com.animalsounds.project;

public class Bird extends Animal{
	//attribute to store the bird sound. here is where it will hold the sound the bird makes
	//each subclass manages its own sound attribute - bird sound for bird subclass, and similar for the cat subclass
	String birdSound;
	
	//constructor to initialise the bird subclass and its attribute 'birdSound', and to call the superclass's constructor to initialise the common attributes
	public Bird(String animalSpecies, String animalSound, String birdSound) {
		//now to call the superclass's constructor 
		super(animalSpecies, animalSound);
		this.birdSound = birdSound;
	}
	
	//now i need to override the displayAnimalInformation method so the bird sound can be included 
	@Override
	public void displayAnimalInformation() {
		super.displayAnimalInformation();
		//now to add the bird sound attribute
		System.out.println("The bird makes a " + birdSound + " sound.");
	}
}