package com.book.project;
//firstly, import java.util.ArrayList; - the ArrayList class is a re-sizable array. 
//The difference between an imported ArrayList and the build in list, is that elements can be added and removed from it whenever. Built-in cannot do this.
import java.util.ArrayList;

public class Book {
	//declaring private string variables to store the title, author and ISBN of the books.
	private String title;
	private String author;
	private String ISBN;
	
	//declaring a static ArrayList to store the list of books.
	//static - static is a non-access modifier used for methods and attributes. 
	//a static method can also be accessed without creating an object of the class first.
	private static ArrayList<Book> bookVariety = new ArrayList<Book>();
	
	//constructor for the book class - initialises the 3 attributes: title, author and ISBN variables
	public Book(String title, String author, String ISBN) {
		//setting the variables to their respective parameters
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	//getter & setter methods - used to access and modify the attributes
	//getting and setting the title 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//getting and setting the author
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//getting and setting the ISBN
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	//static method used so we can add a book to the book variety list - using the add() method
	public static void addBook(Book book) {
		//adds the book object to the book variety ArrayList
		bookVariety.add(book);
	}
	//static method used so we can remover a book from the book variety list - using the remove() method
	public static void removeBook(Book book) {
		//removes the book object from the book variety ArrayList
		bookVariety.remove(book);
	}
	
	//static method to retrieve the entirety of the bookVariety ArrayList
	public static ArrayList<Book> getBookVariety(){
		//returns the entire bookVariety ArrayList
		return bookVariety;
	}
}