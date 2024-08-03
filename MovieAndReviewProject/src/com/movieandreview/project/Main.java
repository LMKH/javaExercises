package com.movieandreview.project;
//importing both array list and arrays from java utility package
import java.util.ArrayList;
//java.util.Arrays - provides methods for manipulating arrays in java. inludes operations such as sorting, searching, comparing, and converting arrays to strings.
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//creating a movie object for a movie - I've chosen Mr Bean's Holiday (2007), as my first chosen movie example.
		//arrays.asList - used to return a fixed-size list
		Movie chosenMovie1 = new Movie("Mr Bean's Holiday", "Steve Bendelack", 
				new ArrayList<>(Arrays.asList("Rowan Atkinson", "Willem Dafoe")));
		
		//creating new review objects
		Review review1 = new Review("\nThe best movie you will ever see in your life!", "Jane Smith", 5.0);
		Review review2 = new Review("\nEmotional, funny, all round amazing film!", "John Stevensson", 4.8);
		Review review3 = new Review("\nTakes you on the 'holiday' of a life time. You will not regret this.", "Simon Letterman", 4.9);
		Review review4 = new Review("\nI cried both tears of joy and sadness watching this film. Please watch it.", "Samantha Field", 5.0);
		Review review5 = new Review("\nI highly recommend this masterpiece to anyone. Perfection.", "Lewis Webb", 5.0);
		Review review6 = new Review("\nWhat are you waiting for? Go see this movie. NOW.", "Felicity Caroline", 4.8);
		
		//now to add above reviews to chosenMovie1
		chosenMovie1.addMovieReview(review1);
		chosenMovie1.addMovieReview(review3);
		chosenMovie1.addMovieReview(review4);
		
		//printing out all the reviews for chosenMovie1 to the console
		System.out.println("Here are all the reviews for " + chosenMovie1.getMovieTitle() + ":");
		//for loop to iterate through the movie reviews for chosenMovie1 and prints them out with text + reviewer + rating
		for (Review review : chosenMovie1.getMovieReviews()) {
			System.out.println(review.getMovieReviewText() + " from " + review.getMovieReviewerName() + ". They rated it: " + review.getMovieRating());
		}
		
		
		//now a new movie object for a second movie - I've chosen the Bee Movie (2007), as my second chosen movie example
		Movie chosenMovie2 = new Movie("Bee Movie", "Simon J. Smith", 
				new ArrayList<>(Arrays.asList("Jerry Seinfeld", "Patrick Warburton", "Renee Zellweger")));
		
		//now to add above reviews to chosenMovie2
		chosenMovie2.addMovieReview(review2);
		chosenMovie2.addMovieReview(review5);
		chosenMovie2.addMovieReview(review6);
		
		//printing out all the reviews for chosenMovie2 to the console
		System.out.println("\nHere are all the reviews for " + chosenMovie2.getMovieTitle() + ":");
		//for loop to iterate through the movie reviews for chosenMovie2 and prints them out with text + reviewer + rating
				for (Review review : chosenMovie2.getMovieReviews()) {
					System.out.println(review.getMovieReviewText() + " from " + review.getMovieReviewerName() + ". They rated it: " + review.getMovieRating());
	}
}
}