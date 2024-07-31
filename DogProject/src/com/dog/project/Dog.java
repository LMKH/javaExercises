package com.dog.project;

public class Dog {
	//the 'private' keyword is an access modifier used for attributes, methods and constructors. Meaning they can only be accessed within a declared class. 
	private String name;
	private String breed;
	
	//the constructor is used in java to initialise objects. here it initialises the 'name' and 'breed' attributes, when the new 'dog' class is created.
	public Dog(String name, String breed) {
		//'this' keyword - refers to the current object in a method or constructor.
		this.name = name;
		this.breed = breed;
	}
	
	//getter & setter methods - the 'get' method returns the variable value and the 'set' method sets the value.
	//syntax for both start with either get or set, followed by the name of the variable, with the first letter in upper case.
	//getting and setting the names.
	public String getName() {
		return name;
	}
	//here we have got the name and now set it.
	public void setName(String name) {
		this.name = name;
	}
	
	//set principle as above, just now its just getting and setting the breeds instead of the names.
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}