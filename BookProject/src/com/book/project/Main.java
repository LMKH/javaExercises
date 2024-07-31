package com.book.project;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// creating 2 instances of the Book class with the title, author and ISBN
		//\n - new lines added to space out the printed out results better.
		Book book1 = new Book("\nThe Design of Everyday Things", "Don Norman", "9785457242975");
		Book book2 = new Book("\nEmma", "Jane Austen", "9780192833570");
		
		//adding both books to the ArrayList - using the add method 
		Book.addBook(book1);
		Book.addBook(book2);
		
		//Retrieving the bookVariety ArrayList and storing the books
		ArrayList<Book> bookVariety = Book.getBookVariety();
		
		//here we print out a heading/title for the console to display above the listed books
		System.out.println("Here are all your books: ");
		
		//for loop - iterates over each of the books until all of them in the list have been displayed
		for (Book book : bookVariety) {
			//using a for loop, it will print out the title, author and ISBN of each of the books and display them in the console
			/*so it displays like this:
			 * "Here are all the books in your library: "
			 * The Design of Everyday Things by Don Norman, ISBN: 9785457242975
			 * etc*/
			System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
		}
		
		//next, to remove a book from the ArrayList - using remove method
		Book.removeBook(book1);
		
		//now book1 has been removed from the Array, we print a message out to confirm this.
		System.out.println("\nYou have removed: " + book1.getTitle() + " by " + book1.getAuthor() + " from your books.");
		
		//a new heading for the updated list of books.
		System.out.println("\nHere are all your remaining books: ");
		
		//another for loop to iterate over the remaining books in the ArrayList.
		for (Book book : bookVariety) {
			System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
		}
	}
}