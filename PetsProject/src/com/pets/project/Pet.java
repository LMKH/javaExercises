package com.pets.project;

public class Pet {
	//creating attributes for the pet class, here is where the pets name, species and age are held.
	String petName;
	String petSpecies;
	int petAge;
	
	//constructor to initialise the pet class and its attributes to their respective parameters
	public Pet(String petName, String petSpecies, int petAge) {
		this.petName = petName;
		this.petSpecies = petSpecies;
		this.petAge = petAge;
	}
	
	//method to print out and display the pet information to the console
	public void displayPetInformation() {
		System.out.println("The pets name is - " + petName);
		System.out.println("The species of the pet is - " + petSpecies);
		System.out.println("The pets age is - " + petAge);
	}
	
	//the method to calculate the pets age in human years
	public int calculateToHumanYears() {
		//if the species inputed equals "Dog" - going on dogs being 7 years on human years, it'll return the inputed age and multiply it by 7
		//otherwise it'll just return the age in regular human years
		if (petSpecies.equals("Dog")) {
			return petAge * 7;
		} else {
			return petAge;
		}
	}
}