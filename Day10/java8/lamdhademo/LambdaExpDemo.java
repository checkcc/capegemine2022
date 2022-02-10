package com.demo.java8.lamdhademo;

@FunctionalInterface
interface Drawables{
	
	public void  draw();
	
}


public class LambdaExpDemo {
		
	public static void main(String ar[]) {
		
		int width = 10;
		//functional style
		Drawables d =() ->{
			
			System.out.println("draw"+width);
		};
		d.draw();
	}
}
