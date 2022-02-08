package com.demo.collectiondemo;

import java.util.ArrayList;

/*
 * Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In ArrayList, manipulation is little bit slower than the 
LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
 * 
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("mango");

		System.out.println(list);

	}

}
