package com.demo.modifiers;

public class PrivateAccessMainDemo {

	public static void main(String[] args) {
		
		PrivateAcessDemo s= new PrivateAcessDemo();
		
		
		//view the account number but u cannot change it
	long dummy = s.getAccountnumber();
	
	System.out.println("my account number"+dummy);
	
	            //set or edit option
	      s.setAddress("hyderabad, plot 1032");
	      
	      String dummyaddress = s.getAddress();
	  	System.out.println("my changed address is -->"+dummyaddress);
	      
	      s.setAddress("mumbai, plot 402");
	      
	      String mumbaiaddress = s.getAddress();
	      
	  	System.out.println("my changed address is -->"+mumbaiaddress);
	  	
	 
		
	  	System.out.println("amount "+ 	s.getAmount());

	}

}
