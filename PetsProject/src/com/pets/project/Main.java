package com.pets.project;

public class Main {

	public static void main(String[] args) {
		//creating a new instance of the Dog
		//includes the dogs name, age and favourite toy
		Dog dog = new Dog("Molly", 7, "Teddy Bear");
		
		//creating a new instance of the Bird
		Bird bird = new Bird("Janice", 3, 55.0);
		
		//to print out the dog's information
		System.out.println("Dog Information");
		System.out.println();
		dog.displayPetInformation();
		//and for the dogs age printing out
		System.out.println("Dog's age in human years - " + dog.calculateToHumanYears() + " years old");
		
		//to print out the bird's information
		System.out.println("\nBird Information");
		System.out.println();
		bird.displayPetInformation();
		//for the birds age printing out
		System.out.println("Bird's age in human years - " + bird.calculateToHumanYears() + " years old");
	}
}