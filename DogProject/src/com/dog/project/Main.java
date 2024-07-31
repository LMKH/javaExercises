package com.dog.project;
//defining the main class
public class Main {

	//created 2 instances of the 'Dog' class, set their attributes with a constructor, printed out their names and breeds using the 'get' method.
	//then updated the names + breeds by using the 'set' method
	
	public static void main(String[] args) {
		//now we create the instances of the 'Dog' class.
		//dog1 instance class with name & breed
		Dog dog1 = new Dog("Maggie", "Rottweiler");
		//dog2 instance class with name & breed
		Dog dog2 = new Dog("Betty", "Dobermann");
		
		//here is where the above dogs names & breeds will be printed out to the console.
		//sysout + ctrl & space - shortcut
		//code explained - prints "name:" concatenating the respective dogs name with getName then + "is a" + the respective dogs breed.
		System.out.println("Name: " + dog1.getName() + " is a " + dog1.getBreed() + ". She is a good dog!");
		System.out.println("Name: " + dog2.getName() + " is a " + dog2.getBreed() + ". She is also a good dog!");
		
		//now to update and change the names and breeds using 'set' method. modifying the attributes with 'set'
		dog1.setName("Janey");
		dog1.setBreed("Beagle");
		dog2.setName("Paula");
		dog2.setBreed("Poodle");
		
		//now similar to above we print out the new updated names + breeds.
		System.out.println("Updated Name: " + dog1.getName() + " is a " + dog1.getBreed() + ". She is a good dog!");
		System.out.println("Updated Name: " + dog2.getName() + " is a " + dog2.getBreed() + ". She is also a good dog!");
	}
}
