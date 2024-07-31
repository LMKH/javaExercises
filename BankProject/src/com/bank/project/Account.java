package com.bank.project;
//this class is for the account itself
//account class to maintain the account details of a specific customer - defining the account class
public class Account {
	//private variables to store the name, bank account number and bank balance attributes
	//string & double types used
	public String name;
	public String bankAccountNumber;
	public double bankBalance;

	//Constructor to initialise the name, bank account number and bank balance variables
	//setting the variables to their respective parameters
	public Account(String name, String bankAccountNumber, double bankBalance) {
		this.name = name;
		this.bankAccountNumber = bankAccountNumber;
		this.bankBalance = bankBalance;
	}
	
	//getter and setter methods
	//retrieve the name & return the name
	public String getName() {
		return name;
	}
	//set the name of the account user and set it to the respective parameter
	public void setName(String name) {
		this.name = name;
	}
	
	//retrieve the bankAccountNumber & return its value
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	//set the bankAccountNumber to its parameter
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	//retrieve the bankBalance value and return it
	public double getBankBalance() {
		return bankBalance;
	}
	//set the bankBalance to its parameter
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	//here is the method to deposit a specific amount into the bank account
	public void addMoney(double amount) {
		//to increase the bankBalance amount by the above specific amount
		// '+=' - is the add and assign operator
		bankBalance += amount;
	}
	
	//now to do the reverse. withdraw from the bankAccount balance
	public void takeMoney(double amount) {
		//to decrease the bankBalance amount by the above specific amount
		// '-=' - is the subtract and assign operator
		bankBalance -= amount;
	}
	
	//method to retrieve the bank account information
	//the following will return the name, bankAccountNumber, and bankBalance
	public String getBankAccountInformation() {
		return "Account Holders Name: " + name + ". Account Number: " + bankAccountNumber + ". Account Balance: " + bankBalance;
	}
}