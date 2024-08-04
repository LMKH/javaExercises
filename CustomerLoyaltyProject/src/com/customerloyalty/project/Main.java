package com.customerloyalty.project;

public class Main {

	public static void main(String[] args) {
		//creating a new customer object
		//here is where their name & email address is stored
		Customer customer1 = new Customer("Janet McDonald", "janetMc78@email.com");
		//here is where we create their purchase history, with their respective price tags
		customer1.addCustomerPurchaseHistory(19.99);
		customer1.addCustomerPurchaseHistory(4.99);
		customer1.addCustomerPurchaseHistory(7.99);
		//printing out to the console the bill for customer1  
		System.out.println("Hi, " + customer1.getCustomerName() + ". Your bill today comes to £" + customer1.calculateCustomerPaymentAmount() + 
				". We will send your receipt to the email you provided us: " + customer1.getCustomerEmailAddress());
		
		//for the loyal customer, create a new loyal customer object
		//their name & email address stored here + the discount. here its a 40% discount
		Customer loyalCustomer = new LoyalCustomer("Dennis James", "dennisJ@email.com", 40);
		//here is where we create their purchase history, with their respective price tags
		loyalCustomer.addCustomerPurchaseHistory(59.99);
		loyalCustomer.addCustomerPurchaseHistory(20.99);
		loyalCustomer.addCustomerPurchaseHistory(30.99);
		loyalCustomer.addCustomerPurchaseHistory(9.99);
		loyalCustomer.addCustomerPurchaseHistory(11.99);
		loyalCustomer.addCustomerPurchaseHistory(2.99);
		loyalCustomer.addCustomerPurchaseHistory(4.99);
		//now finally for the loyal customers bill
		System.out.println("Hi, " + loyalCustomer.getCustomerName() + ". We want to thank you for being a Loyal Customer! Here's 40% off your shop with us today! "
				+ "Your bill today comes to £" + loyalCustomer.calculateCustomerPaymentAmount() + ". We will send your receipt to the email you provided us: "
				+ loyalCustomer.getCustomerEmailAddress());
	}
}