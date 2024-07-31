package com.bank.project;

//first, i need to import java.util.ArrayList, doing this allows me to create arrays & lists, and to be able to modify them easily, 
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//creating a brand new Bank object
		Bank bank = new Bank();
		
		//creating 3 new account objects with details
		//name, account number, and the balance in their bank accounts
		Account account1 = new Account("Hannah Jones", "B1991", 14800);
		Account account2 = new Account("John Webb", "B2598", 12630);
		Account account3 = new Account("Dennis May", "B7837", 33000);
		
		//to add the above accounts to the bank
		//using add() method - do this for all 3 above accounts
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);
		
		//to retrieve the list of accounts from the bank
		ArrayList<Account> accounts = bank.getAccounts();
		
		//looping through the bank account list will display all accounts in the list
		for (Account account: accounts) {
			//for each account print out its information
			System.out.println(account.getBankAccountInformation());
		}
		
		//Message indicating the beginning of the deposit transaction
		System.out.println("\nBalance after depositing �2000 into account1");
		//adding �2000 into account1
		bank.addMoney(account1, 2000);
		//updated bank info
		System.out.println(account1.getBankAccountInformation());
		System.out.println(""); //for extra space
		
		//Message indicating the beginning of the deposit transaction
		System.out.println("\nBalance after depositing �1350 into account2");
		//adding �1350 into account2
		bank.addMoney(account2, 1350);
		//updated bank info
		System.out.println(account2.getBankAccountInformation());
		System.out.println(""); //for extra space
		
		//Message indicating the beginning of the withdrawal transaction
		System.out.println("\nBalance after withdrawing �8275 from account3");
		//removing �8275 from account3
		bank.takeMoney(account3, 8275);
		//updated bank info
		System.out.println(account3.getBankAccountInformation());
		System.out.println(""); //for extra space
		}
}