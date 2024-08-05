package com.electronicproducts.project;

public class ElectronicsProduct {
	//creating private attributes to hold the electronic products ID, name, & price
	private String electronicProductID;
	private String electronicProductName;
	private double electronicProductPrice;
	
	//constructor to initialise the ElectronicsProduct object + the attributes to their respective parameters
	public ElectronicsProduct(String electronicProductID, String electronicProductName, double electronicProductPrice) {
		this.electronicProductID = electronicProductID;
		this.electronicProductName = electronicProductName;
		this.electronicProductPrice = electronicProductPrice;
	}
	
	//here is the method for applying a discount to the product price
	public void applyProductDiscount(double productDiscountPercentage) {
		//calculating the discounted amount
		double productDiscountAmount = electronicProductPrice * productDiscountPercentage / 100;
		//next, take the discounted amount away from the original price. what is returned is the new discounted price
		electronicProductPrice -= productDiscountAmount;
	}
	
	//method to calculate the final price after the discount being applied
	public double getFinalElectronicProductPrice() {
		//if discount applied, it will be shown in the final price
		return electronicProductPrice;
	}
	
	//getter methods - to get the values from the attributes
	//get + return the product ID
	public String getElectronicProductID() {
		return electronicProductID;
	}
	
	//get + return the product name
	public String getElectronicProductName() {
		return electronicProductName;
	}
	
	//get + return the product price
	public double getElectronicProductPrice() {
		return electronicProductPrice;
	}
}