package com.demo.java8.lamdhademo;

@FunctionalInterface
interface Sayable{
	
	public String  say();
	
}


public class WithNoParameter {
		
	public static void main(String ar[]) {
		
		//functional style
		Sayable s =() ->{
			return "hi how are you"; 
		};
		System.out.println(s.say());
	}
}


