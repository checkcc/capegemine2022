package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 *
 * collections.sort()
 * The java.util package provides a utility class Collections 
 * which has the static method sort(). Using the Collections.sort() method, 
 * we can easily sort the ArrayList.
 * 
 */

public class SortingDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("banana");
		list.add("mango");
		list.add("apple");
		list.add("payapya");
		list.add("jackfruit");

		Collections.sort(list);   //for sorting as alphbatically
               ///looping using iterator
		Iterator iter = list.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());
		}
		
		
		//enchance forloop
		
		for(String fruits:list) {
			
			System.out.println(" using enchanced loop  " +fruits);
		}
		
		//sorting the  numbers
		
		List<Integer> listnumber = new ArrayList<Integer>();
		listnumber.add(13);
		listnumber.add(15);
		listnumber.add(5);
		listnumber.add(2);
		
		Collections.sort(listnumber);   //for sorting as numbers
		
		//enchance forloop for integer
		
		for(Integer numberlist:listnumber) {
			
			System.out.println(" using enchanced loop  " +numberlist);
		}
		

	}

}
