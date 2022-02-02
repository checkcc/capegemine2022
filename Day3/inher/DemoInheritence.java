package com.demo.inher;

class Bank{
	 
	 void Deposit() {
		 
		 System.out.println("deposit");
	 }
 }
 
 
 class ICICI extends Bank{
	 
 void Deposit() {
	 
	// super.Deposit(); ///it called super class that is bank class
		 
		 System.out.println(" ICICI deposit");
		 
		 
	 }
	 
 }
 
 class Hdfc extends Bank{
	 
 void Deposit() {
		 
		 System.out.println(" hdfc deposit");
	 }
	 
 }



 class DemoInheritence {
	
	
	public static void main(String ar[]) {
		/// we override the deposit method of parent class
		Bank bank = new ICICI();   ///dyanmic dispatch or run polymorphism
		bank.Deposit();
		
		
		Bank bank1 = new Hdfc();   ///dyanmic dispatch or run polymorphism
		bank1.Deposit();
		
		
	}

}
