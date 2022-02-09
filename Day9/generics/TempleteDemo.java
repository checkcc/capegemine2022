package com.demo.generics;


//We use < > to specify Parameter type
 class TempleteD<T> {
	
	T t;
	TempleteD(T t){
		
		this.t=t;
		
		System.out.println(t);
	}

}


 public class TempleteDemo{
	public static void main(String ar[]) {
		 //integer type passing in constructor
		TempleteD t1 = new TempleteD(12);
		 //String type passing in constructor
		TempleteD t2 = new TempleteD("45");
	}
	
}
