package com.bankandsavings.project;

//the savingsAccount subclass extends to the BankAccount class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class SavingsAccount extends BankAccount{
	
	//the attribute for the interest rate
	private double theInterestRate;
	
	//constructor to initialise the the savings account object and assign the variable attribute to its provided detail
	public SavingsAccount(String bankAccountNumber, String bankAccountHolderName, double initialBankAccountBalance, double theInterestRate) {
		//super - the super keyword refers to the superclass (parent) objects. it is used to call superclass methods, and to access the superclass constructor.
		super(bankAccountNumber, bankAccountHolderName, initialBankAccountBalance); //here is where it calls the superclass (BankAccount) constructor.
		this.theInterestRate = theInterestRate;
	}
	
	//the method for adding the interest rate to the bank account balance
	public void applyTheInterestRate() {
		//here is where the interest is calculated - it calculates based on the current balance and interest rate - then it deposits the interest into the bank account
		double theInterest = checkBankAccountBalance() * theInterestRate / 100;
		//now adding interest to the balance 
		depositMoney(theInterest);
		System.out.println("\nInterest has been applied to your savings account balance. The amount applied is: " + theInterest + ". Your new updated savings account balance is: " + checkBankAccountBalance());
	}
	
	//getter method for the interest rate
	public double getTheInterestRate(){
		//returns the current interest rate
		return theInterestRate;
	}
	
	//setter method for the interest rate
	public void setTheInterestRate(double theInterestRate) {
		//updates the interest rate
		if (theInterestRate > 0) {
			this.theInterestRate = theInterestRate;
		}else {
			//so if what was inputed was 0 or not a positive number - the following else message will print
			System.out.println("You have inputted an incorrect amount. Please try again.");
		} 
	}
}