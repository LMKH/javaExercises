package com.animalsoundmoves.project;

public class Bird extends Animal{
	//constructor to initialise the Bird subclass + call the superclass constructor
	public Bird(String animalName, String animalSpecies) {
		super(animalName, animalSpecies);
	}
	
	//Overriding the superclass's method - animal moves()
	@Override
	public void animalMove() {
		System.out.println(animalName + " is a " + animalSpecies + ". " + animalSpecies + "'s move by flying.");
	}
	
	//now overriding the superclass method - animal sounds()
	public void animalSound() {
		System.out.println(animalName + " is a " + animalSpecies + ". " + animalSpecies + "'s make a 'tweet' sound.\n");
	}
}