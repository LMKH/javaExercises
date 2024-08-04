package com.bankandsavings.project;

//creating the Bank account class
public class BankAccount {
	//variables to hold the bank attributes - account number, holder name and bank balance
	private String bankAccountNumber;
	private String bankAccountHolderName;
	private double bankAccountBalance;
	
	//constructor to initialise the above variables and the bank account object
	public BankAccount(String bankAccountNumber, String bankAccountHolderName, double initialBankAccountBalance) {
		this.bankAccountNumber = bankAccountNumber;
		this.bankAccountHolderName = bankAccountHolderName;
		this.bankAccountBalance = initialBankAccountBalance;
	}
	
	//method to deposit money into the bank account
	public void depositMoney(double amountMoney) {
		//only adds an amount if its a positive value being placed, for instance you couldn't deposit in -100.  
		//so it must be greater than nothing.
		if (amountMoney > 0) {
			bankAccountBalance += amountMoney;
			System.out.println("\nYou have deposited £" + amountMoney + " into your bank account. The new balance of the account is £" + bankAccountBalance);
		} else {
			System.out.println("\nYou cannot deposit less than or equal to £0. Please try again.");
		}
	}
	
	//method to withdraw money from the bank account
	public void withdrawMoney(double amountMoney) {
		//here it will take away a specified amount from the bank account - as long as the specified amount is a positive value 
		//and the amount doesn't exceed the amount already in the bank account. i.e. you couldn't take £1000 out of a bank account that has £50 in it.
		//and for a positive value, i.e. you couldn't take -£300 out. 
		//if you wanted to take £300 out of the account a) there must be at least £300 already in the account and b) you would in put the positive value '300', not '-300'
		//&& - denotes the and operator - amountMoney <= -less than or equal to the amount in the bankAccountBalance
		if (amountMoney > 0 && amountMoney <= bankAccountBalance) {
			//bankAccountBalance and take away the specified amount
			bankAccountBalance -= amountMoney;
			System.out.println("\nYou have withdrawn £" + amountMoney + " from your bank account. The new balance of the account is £" + bankAccountBalance);
		} else {
			System.out.println("\nYou either do not have enough money in this account to complete this transaction, or you have inputted an incorrect amount.");
		}
	}
	
	//method to simply check the amount in the bank account - it will return the bank balance 
	public double checkBankAccountBalance() {
		return bankAccountBalance;
	}
	
	//method to get and return the bank account number - it will return the bank account number
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	
	//method to get and return the bank account holders name - it will return the name of the bank account holder
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}
}