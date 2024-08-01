package com.librarybooks.project;

public class Main {

	public static void main(String[] args) {
		//creating a new instance of the Library Class
		Library library = new Library();
		
		//creating  new book objects with the books title and author
		Book book1 = new Book("\nNineteen Eighty-Four", "George Orwell");
		Book book2 = new Book("The Hunger Games", "Suzanne Collins");
		Book book3 = new Book("Life of Pi", "Yann Martel");
		Book book4 = new Book("The Da Vinci Code", "Dan Brown");
		
		//now to add those above books to the library - using addBook method
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		
		//now to print out a message to the console telling the user what books are in the library
		System.out.println("Welcome to the Library! Here are the books we have: ");
		
		//for loop to iterate through the book list/library
		for (Book book : library.getBooks()) {
			//now each book with its title and author will be printed out to the console
			System.out.println(book.getBookTitle() + " by " + book.getBookAuthor());
		}
		
		//now for removing a book from the library - using removeBook method 
		//we remove book4 - "The Da Vinci Code", "Dan Brown"
		library.removeBook(book4);
		
		//printing out a message to the console confirming to the user they have removed a book with a little reminder
		System.out.println("\nYou have removed " + book4.getBookTitle() + " by " + book4.getBookAuthor() + " from the Library. \nWe hope you enjoy the book! Please take good care of it and return it before its due date! Thank you!");
		
		//finally, to iterate through and display the remaining books in the library
		System.out.println("\nHere are our remaining books. See anything else you fancy?");
		for (Book book : library.getBooks()) {
			System.out.println(book.getBookTitle() + " by " + book.getBookAuthor());
		}
	}
}