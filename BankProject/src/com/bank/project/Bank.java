package com.bank.project;
//first, i need to import java.util.ArrayList, doing this allows me to create arrays & lists, and to be able to modify them easily
import java.util.ArrayList; 

//class for the bank itself - defining the bank class
public class Bank {
	//declaring an ArrayList to store all the account objects
	private ArrayList<Account> accounts;
	
	//constructor - used for the bank class to initialise the empty account ArrayList
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	//now to use the add() method so we can add a new bank account to the account ArrayList
	public void addAccount(Account account) {
		//adding the newly created account to the accounts list
		accounts.add(account);
	}
	
	//now the method to remove a bank account from the ArrayList - this time using remove()
	public void removeAccount(Account account) {
		//removing a created account from the accounts list
		accounts.remove(account);
	}
	
	//now the method to add money to a chosen account
	//double - for numbers with a decimal place
	public void addMoney(Account account, double amount) {
		//this method needs to be called so we can place money in to the chosen account
		account.addMoney(amount);
	}
	
	//now the method to take money from a chosen account
	public void takeMoney(Account account, double amount) {
		//this method needs to be called so we can take money from the chosen account
		account.takeMoney(amount);
	}
	
	//method that allows the list of accounts to be displayed
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
}