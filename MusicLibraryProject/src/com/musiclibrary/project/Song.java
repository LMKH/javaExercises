package com.musiclibrary.project;

public class Song {
	//private fields to store the songs titles and artists
	private String title;
	private String artist;
	
	//constructor to initialise the titles and artists variables and set them to their parameters
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	//getter & setter methods - retrieving then updating 
	//retrieve the song title and set it
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//retrieve the song artist/s and set it
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
}