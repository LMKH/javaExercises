package com.electronicproducts.project;

public class Main {

	public static void main(String[] args) {
		//creating a brand new ElectronicsProduct object w/ ID, name & price
		ElectronicsProduct electronicProduct = new ElectronicsProduct("EWAM873", "Eco Washing Machine", 389.99);
		//applying the discount, 15% off + displaying the final total to the console
		electronicProduct.applyProductDiscount(15);
		System.out.println("Product Identification: " + electronicProduct.getElectronicProductID());
		System.out.println("Product Name: " + electronicProduct.getElectronicProductName());
		System.out.println("Product price after discount: £" + electronicProduct.getFinalElectronicProductPrice());
		//white space for readability
		System.out.println("");
		
		//now creating a brand new washing machine object w/ ID, name & price + warranty period (48 months - 4 year warranty)
		WashingMachine washingMachine = new WashingMachine("LWAM244", "Large Top Loading Washing Machine", 919.99, 48);
		//applying the discount, 20% off + displaying the final total to the console
		washingMachine.applyProductDiscount(20);
		System.out.println("Product Identification: " + washingMachine.getElectronicProductID());
		System.out.println("Product Name: " + washingMachine.getElectronicProductName());	
		System.out.println("Product price after discount: £" + washingMachine.getFinalElectronicProductPrice());
		//+ the warranty period
		System.out.println("Product warranty period: " + washingMachine.getproductWarrantyPeriod() + " total months");
		
		//to extend the warranty by a further 24 months, extra 2 years on top of the original warranty (72 months - 6 year warranty) 
		washingMachine.extendProductWarrantyPeriod(24);
		System.out.println("Product warranty period after extension: " + washingMachine.getproductWarrantyPeriod() + " total months");
	}
}