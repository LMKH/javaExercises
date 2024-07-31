package com.musiclibrary.project;

//first, i need to import java.util.ArrayList, doing this allows me to create arrays & lists, and to be able to modify them easily
import java.util.ArrayList; 

//secondly, i need to import java.util.Random
//random class is used to generate random numbers in java.
import java.util.Random;

public class MusicLibrary {
	
	//declaring a private field to store the list of song objects
	//private field - in java is a variable declared within a class that can only be accessed and modified by methods within the same class.
	//this means that the field is not accessible directly from outside the class.
	private ArrayList<Song> songs;
	
	//constructor to initialise the songs list
	public MusicLibrary() {
		//creating a new ArrayList to hold the song objects
		songs = new ArrayList<Song>();
	}
	
	//method for adding songs to the MusicLibrary - using the add method()
	public void addSong(Song song) {
		//now to add that song to the song list
		songs.add(song);
	}
	
	//method for removing songs from the MusicLibrary - using the remove method()
	public void removeSong(Song song) {
		//removing that song from the song list
		songs.remove(song);
	}
	
	//the method to get all the songs in the library
	public ArrayList<Song> getSongs(){
		//returns the list of songs
		return songs;
	}
	
	//utilising random to create a shuffle feature, so all the songs in the music library can be played in a random shuffled order.
	public void playShuffledSongs() {
		//now we get the number of songs in the music library
		//.size - the size() method in java is used to get the number of elements in a list. It returns the count of elements present in a selected list container.
		int sizeOfMusicLibrary = songs.size();
	
	
	//now to check if the library actually has any songs in it.
	//to see if the library is in fact empty, we can do a if statement to check if the library's size is equal == to 0
	if (sizeOfMusicLibrary == 0) {
		//if there is no songs in the users music library, we can print a message notifying them of this.
		System.out.println("You have no songs in your Library right now :( Go add some!");
		//exiting the method
		return;
	}
	
	//for the random shuffle feature:
	//creating a new random object so it will create a random number
	Random shuffle = new Random();
	
	//creating a random index within the range of the song list
	int index = shuffle.nextInt(sizeOfMusicLibrary);
	
	//finally, printing out to the console a "Now Playing:" with the title of the track and the artist/s of the randomly chosen song
	System.out.println("Now Playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
	
	//every time the code is run a new song will be played
}
}