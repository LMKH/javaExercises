package com.movieandreview.project;

public class Review {
	//first, private fields to store the reviews text, the reviewers name, and the rating of the movie
	public String movieReviewText;
	public String movieReviewerName;
	public double movieRating;
	
	//constructor to initialise the above private fields, and set the fields to their respective provided parameters
	public Review(String movieReviewText, String movieReviewerName, double movieRating) {
		this.movieReviewText = movieReviewText;
		this.movieReviewerName = movieReviewerName;
		this.movieRating = movieRating;
	}
	
	//get the movie review text
	public String getMovieReviewText() {
		return movieReviewText;
	}
	
	//get the movie reviewer's name
	public String getMovieReviewerName() {
		return movieReviewerName;
	}
	
	//get the movie rating
	public double getMovieRating() {
		return movieRating;
	}
}