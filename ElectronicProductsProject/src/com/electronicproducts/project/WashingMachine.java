package com.electronicproducts.project;

//the WashingMachine subclass extends to the ElectronicsProduct class 
//subclass (child) - a class that is derived from another class. 
//superclass (parent) - the class being inherited from.
public class WashingMachine extends ElectronicsProduct{
	//washing machine attribute for the product warranty period - the period is in months
	private int productWarrantyPeriod; 
	
	//constructor to initialise the Washing Machine attributes and the Washing machine object + call the constructor of the superclass (ElectronicsProduct)
	public WashingMachine(String electronicProductID, String electronicProductName, double electronicProductPrice, int productWarrantyPeriod) {
		//calling the superclass's constructor
		super(electronicProductID, electronicProductName, electronicProductPrice);
		this.productWarrantyPeriod = productWarrantyPeriod;
	}
	
	//method for extending the current warranty period - i.e. for adding more time on to the current warranty period.
	public void extendProductWarrantyPeriod(int additionalMonths) {
		//add more time to the warranty period
		productWarrantyPeriod += additionalMonths;
	}
	
	//get the warranty period and return the value
	public int getproductWarrantyPeriod() {
		return productWarrantyPeriod;
	}
	
	//now we need to override the applyProductDiscount() method, which prints out to the console. 
	//we need to do this so that we can include the warranty period alongside the other attributes.
	
	//Override - in java, overriding is a feature that allows a subclass or child-class 
	//to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
	//When a method in a subclass has the same name, the same parameters, or signature, and the same return type as a method in its super-class, 
	//then the method in the subclass is said to OVERRIDE the method in the super-class
	@Override
	public void applyProductDiscount(double productDiscountPercentage) {
		//calling the superclass's method so we can apply the discount  
		super.applyProductDiscount(productDiscountPercentage);
		//printing out a message to the console to notify the user that the discount has been applied successfully.  
		System.out.println("***Discount applied to " + getElectronicProductName() + "***");
	}
}