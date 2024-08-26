package com.sports.project;

public class Main {

	public static void main(String[] args) {
		//creating instances of each sport + the sport class itself
		//these are to be simply printed to the console and due to their being no attributes nothing needs to be placed inside the brackets ()
		Sport sport = new Sport();
		Football football = new Football();
		Basketball basketball = new Basketball();
		Rugby rugby = new Rugby();
		
		//finally, to call the method with each class & subclass. Now all will be printed to the console
		sport.playSport();
		football.playSport();
		basketball.playSport();
		rugby.playSport();
	}
}