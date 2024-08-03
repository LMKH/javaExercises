package com.movieandreview.project;
//import java.util.ArrayList - to create array lists
import java.util.ArrayList;

public class Movie {
	//creating private fields
	//this is where the title of the movie, the movies director, an array list of actors in the movie, and an array list of reviews of the movie will be stored. 
	public String movieTitle;
	public String movieDirector;
	public ArrayList<String> movieActors;
	public ArrayList<Review> movieReviews;
	
	//constructor to initialise the above private fields - setting the private fields to their respective provided titles 
	public Movie(String movieTitle, String movieDirector, ArrayList<String> movieActors) {
		this.movieTitle = movieTitle;
		this.movieDirector = movieDirector;
		this.movieActors = movieActors;
		this.movieReviews = new ArrayList<Review>(); //here for movieReviews, I am initialising the list to an empty Array List
	}
	
	//here is the method to add reviews to the movie - using the addMethod()
	public void addMovieReview(Review review) {
		this.movieReviews.add(review);
	}
	//now to get all the movie reviews returned in an array list - using the getMethod()
	public ArrayList<Review> getMovieReviews(){
		return this.movieReviews;
	}
	
	//getting & returning the movie title value
	public String getMovieTitle() {
		return this.movieTitle;
	}
	
	//getting & returning the movies director value
	public String getMovieDirector() {
		return this.movieDirector;
	}
	
	//getting & returning the list of actors in the movie
	public ArrayList<String> getMovieActors(){
		return this.movieActors;
	}
}