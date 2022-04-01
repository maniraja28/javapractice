package collectionspractice;

import java.util.HashMap;

public class HashMapRunner {

	public static void main(String[] args) {
		
		// MAP -> (key,value)
		// Hetro (mixed types)
		// insertion order not preserved (based on keys)
		// Duplicates are not allowed (keys)
		// if key is duplicate then it will pick latest value assigned to that key
		// CRUD
		// Create Read Update Delete
		//put key, value
		//put methods are used in map

		HashMap hm = new HashMap();
		hm.put(2, "john"); // Creation or adding (C)
		hm.put(1, "scott");
		hm.put(5, "abraham");
		hm.put(6, "ram");
		hm.put(3, "tiger");
		hm.put(17, "Raheem");
		hm.put(1, "ram");
		hm.put(5, "raju");
		hm.put(9, "arvind");
		hm.put(9, "srinu");
		hm.put(2, "rani");

		System.out.println(hm); // Reading
		
		
		System.out.println(hm.get(17)); // Reading
		
		
	hm.remove(5); // Deletion / removal
		
		System.out.println("after removal "+hm); 
		
		
		
		hm.replace(2, "pawan");//update or replace
		
		
		System.out.println("after replcae/update ...  "+hm); 
		
	
		
		
	}
}
