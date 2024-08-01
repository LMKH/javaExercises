package com.librarybooks.project;

//firstly, import java.util.ArrayList - allows me to create array Lists
import java.util.ArrayList;

public class Library {
	//creating a private field to hold all the book objects
	private ArrayList<Book> books;
	
	//constructor to initialise the books field
	public Library() {
		//this new array list holds the book objects
		books = new ArrayList<Book>();
	}
	
	//here is the method to add a book to the books list - using add method()
	public void addBook(Book book) {
		//now a book will be added to the books list
		books.add(book);
	}
	
	//to do the reverse by removing a book from the books list - using remove method()
	public void removeBook(Book book) {
		//now a book will be removed from the books list
		books.remove(book);
	}
	
	//finally, to get all the books in the books list we can return the list.
	public ArrayList<Book> getBooks(){
		//here it returns the list of books
		return books;
	}
}