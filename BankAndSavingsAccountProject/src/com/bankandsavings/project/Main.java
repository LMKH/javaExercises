package com.bankandsavings.project;

public class Main {

	public static void main(String[] args) {
		//creating a new bank account object - bank account number, holders name & balance
		BankAccount account = new BankAccount("444128795", "Will Lewis", 15825.00);
		//prints out to the console the bank account holders name + their bank balance
		System.out.println("Welcome " + account.getBankAccountHolderName() + ". Your bank balance is £" + account.checkBankAccountBalance());
		
		//now to deposit money into the account - £400
		account.depositMoney(400.0);
		//and to withdraw money from the account - £150
		account.withdrawMoney(150.0);
		
		//display to the console the updated balance
		System.out.println("\nWelcome " + account.getBankAccountHolderName() + ". Your bank account balance is £" + account.checkBankAccountBalance());
		
		//now to create a saving account object - savings account number, holders name, initial balance + the interest rate
		SavingsAccount savings = new SavingsAccount("447729700", "Will Lewis", 7060.00, 4.2);
		//now the interest rate is being applied
		savings.applyTheInterestRate();
		System.out.println("\nWelcome " + savings.getBankAccountHolderName() + ". Your savings account balance is £" + savings.checkBankAccountBalance());
	}
}