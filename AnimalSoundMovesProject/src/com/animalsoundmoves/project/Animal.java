package com.animalsoundmoves.project;

public class Animal {
	//attributes for the animals name and the animals species
	public String animalName;
	public String animalSpecies;
	
	//constructor to initialise the Animal superclass and its attributes
	public Animal(String animalName, String animalSpecies) {
		this.animalName = animalName;
		this.animalSpecies = animalSpecies;
	}

	//getter and setter methods
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalSpecies() {
		return animalSpecies;
	}

	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}
	
	//animal move method - to be overridden by subclasses 
	public void animalMove() {
		System.out.println("-"); //placeholder
	}
	
	//animal sound method - to be overridden by subclasses 
	public void animalSound() {
		System.out.println("-"); //placeholder
	}
}