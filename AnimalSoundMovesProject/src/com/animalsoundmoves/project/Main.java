package com.animalsoundmoves.project;

public class Main {

	public static void main(String[] args) {
		//creating a new bird instance
		Bird bird = new Bird("Parrot", "Bird");
		
		//creating a new panthera instance
		Panthera panthera = new Panthera("Lion", "Panthera");
		
		//calling the bird methods
		bird.animalMove();
		bird.animalSound();
		
		//calling the panthera methods
		panthera.animalMove();
		panthera.animalSound();
	}
}