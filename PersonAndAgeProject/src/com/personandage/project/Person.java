package com.personandage.project;

public class Person {
	//the 'private' keyword is an access modifier used for attributes, methods and constructors. This means they are only accessible within the declared class.
	private String name;
	private int age;
		
	//constructor - a constructor is a block of code that initialises the state and value during object creation 
	public Person(String name, int age) {
		//'this' keyword - refers to the current object in a method or constructor.
		this.name = name; //here i set the instance variable "name" to the parameter "name"
		this.age = age; //here i set the instance variable "age" to the parameter "age"
	}
	
	//the use of 'get'. the 'get' method returns the variable value. so here is where we get the value of 'name' returned.
	public String getName() {
		return name;
	}
	
	//again using the 'get' method, here is where we get the value of 'age' returned.
	public int getAge() {
		return age;
	}
	
	//write 'sysout' + ctrl & space, shortcut to System.out.println()
	//here by concatenating, we can print out both a place for 'name' and 'age' with the data from Main.
	public void printPersonsDetails() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}