package com.animalsoundmoves.project;

public class Panthera extends Animal{
	//constructor to initialise the Panthera subclass + call the superclass constructor
	public Panthera(String animalName, String animalSpecies) {
		super(animalName, animalSpecies);
	}
	
	//Overriding the superclass method for animal moves
	@Override
	public void animalMove() {
		System.out.println(animalName + " is a " + animalSpecies + ". " + animalSpecies + "'s move by walking and running.");
	}
	
	//Overriding the superclass method for animal sounds
	public void animalSound() {
		System.out.println(animalName + " is a " + animalSpecies + ". " + animalSpecies + "'s make a 'prrrrr' sound.");
	}
}