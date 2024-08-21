package com.animalsounds.project;

//superclass/bass class Animal
public class Animal {
	//creating String attributes for the species and sound of the animal, for the animal superclass.
	//i've decided to name one of the attributes 'animal species', simply so we know what the animal species is between bird or cat
	//and for the animal sound - basically e.g. " animal species = cat, animal sound = meow "
	public String animalSpecies;
	public String animalSound;
	
	//constructor to initialise the Animal class and its attributes to their respective parameters
	public Animal(String animalSpecies, String animalSound) {
		this.animalSpecies = animalSpecies;
		this.animalSound = animalSound;
	}

	//getter and setter methods for the animal species and the animal sound
	
	//reminder! - shortcut for getter and setter methods:
	// Alt + Shift + S, and then R
	public String getAnimalSpecies() {
		return animalSpecies;
	}

	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}

	public String getAnimalSound() {
		return animalSound;
	}

	public void setAnimalSound(String animalSound) {
		this.animalSound = animalSound;
	}
	
	//method to display the animals species and sound
	//here it will print out the animal species, so either bird or cat
	//then it'll also print the animal sound, i.e. 'tweet' for bird, or 'meow' for cat.
	public void displayAnimalInformation() {
		System.out.println("The animal species is: " + animalSpecies);
	}
}