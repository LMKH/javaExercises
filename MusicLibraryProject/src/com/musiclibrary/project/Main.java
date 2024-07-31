package com.musiclibrary.project;

public class Main {

	public static void main(String[] args) {
		//creating a new instance of the MusicLibrary Class
		MusicLibrary library = new MusicLibrary();
		
		//now to add as many songs as we want to the Music Library 
		library.addSong(new Song("Von Dutch", "Charli XCX"));
		library.addSong(new Song("Can't Get You Out Of My Head", "Kylie Minogue"));
		library.addSong(new Song("Good Luck, Babe!", "Chappell Roan"));
		library.addSong(new Song("Wannabe", "Spice Girls"));
		library.addSong(new Song("yes, and?", "Ariana Grande"));
		library.addSong(new Song("Crazy In Love", "Beyonce feat. JAY-Z"));
		library.addSong(new Song("Gimme More", "Britney Spears"));
		library.addSong(new Song("Only Girl (In The World)", "Rihanna"));
		library.addSong(new Song("Bejeweled", "Taylor Swift"));
		library.addSong(new Song("Rain On Me", "Lady Gaga & Ariana Grande"));
		library.addSong(new Song("Video Games", "Lana Del Rey"));
		library.addSong(new Song("Ironic", "Alanis Morissette"));
		library.addSong(new Song("Jaded", "Miley Cyrus"));
		library.addSong(new Song("Into the Groove", "Madonna"));
		library.addSong(new Song("Dancing Queen", "ABBA"));
		library.addSong(new Song("Please Please Please", "Sabrina Carpenter"));
		library.addSong(new Song("Set My Heart On Fire (I'm Alive)", "Celine Dion & Majestic"));
		
		//now to print out all the songs to the console
		System.out.println("All Tracks:");
		
		//using a for loop we can iterate through all of the songs and artists
		for (Song song: library.getSongs()){
			//now it will print them all out to the console
			System.out.println(song.getTitle() + " by " + song.getArtist());
		}
		
		//for playing a random shuffled song
		System.out.println("\nNow Shuffling");
		//printing and playing a random song
		library.playShuffledSongs();
	}
}