package com.demo.collectiondemo;

import java.util.LinkedList;

/* 
 * The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 * 
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<String> linklistdemo = new LinkedList<String>();
		
		linklistdemo.add("Mango");
		linklistdemo.add("Banana");
		linklistdemo.add("nuts");
		linklistdemo.add("Kiwi");
		linklistdemo.add("Orange");
		linklistdemo.add("apple");
		linklistdemo.add("apple");
		linklistdemo.add("apple");
		
		for (String fruits : linklistdemo) {
			System.out.println("list of fruit  " + fruits);
		}
		
		linklistdemo.addFirst("PAYAPA");
		linklistdemo.addLast("JACKFRUIT");
		
		System.out.println("After adding  elememnts.............");
		for (String fruits : linklistdemo) {
			System.out.println("list of fruit  " + fruits);
		}
		
		
	}

}
