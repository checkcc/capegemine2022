package com.demo.collectiondemo;

import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

/* The important points about Java treeHashSet class are:

Java treeHashSet class contains unique elements only like HashSet.
Java treeHashSet class provides all optional set operation and permits doest not take null elements.
Java treeHashSet class is non synchronized.
Java treeHashSet class maintains insertion order.

Sorting is not possible for null values?

Used to sorting large amount of information.
 * 
 * 
 * 
 * 
 * */

public class TreeSetDemo {

	public static void main(String ar[]) {

		// Set<String> setdemo = new treeHashSet<String>();

		Set<String> treesetdemo = new TreeSet<String>();

		treesetdemo.add("apple");
		treesetdemo.add("mango");
		
		treesetdemo.add("nuts");
		treesetdemo.add("apple");
		treesetdemo.add("apple");
		treesetdemo.add("apple");
		treesetdemo.add("apple");
		treesetdemo.add("banana");
		// Collections.synchronizedSet(setdemo);///explicity

		treesetdemo.add(null);


		Iterator iterator = treesetdemo.iterator();

		if (iterator != null) {

			while (iterator.hasNext()) {

				System.out.println(iterator.next());

			}

		}

	}

}
