package com.animalsounds.project;

public class Main {

	public static void main(String[] args) {
		//creating instances of both bird and cat sounds
		Bird bird = new Bird("Bird", "Tweet", "Tweet");
		Cat cat = new Cat("Cat", "Meow", "Meow");
		
		//now to add those instances to the displayAnimalInformation method for both animals
		bird.displayAnimalInformation();
		//sysout for spacing 
		System.out.println();
		cat.displayAnimalInformation();
		
		//so it'll print to the console what the animal species is and what sound it makes
	}
}