package com.librarybooks.project;

public class Book {
	//private variables to store & hold the books title and author
	private String bookTitle;
	private String bookAuthor;
	
	//constructor to initialise the above variables to their respective parameters
	public Book(String bookTitle, String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	
	//getter & setter methods - get the value of the variables and return them by setting them respectively to both title & author
	//for title
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	//now for the author
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
}