package com.personandage.project;

public class Main {

	public static void main(String[] args) {
		//here is where we place the two instances of the 'person' class. in a string we place their names, then after it with an int with their ages.
		//'new' creates a brand new object.
		Person person1 = new Person("Jane", 33);
		Person person2 = new Person("John", 44);
		
		//now we can print the individuals names and ages
		person1.printPersonsDetails();
		person2.printPersonsDetails();
	}
}
