package com.demo.collectiondemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//hashmap properties

/*Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.  */

public class MapDemo {
	
	public static void main(String ar[]) {
		
		Map<Integer,String> map = new HashMap<Integer, String>(); // legaecy way
		
		map.put(1, "Ram");
		map.put(2, "Sham");
		map.put(3, "Arnav");
		map.put(4, "john");
		
		Set set = map.entrySet();
	
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(" Key--->" + entry.getKey() + "value -->"+entry.getValue());
		}
	
	
	}
	


}
