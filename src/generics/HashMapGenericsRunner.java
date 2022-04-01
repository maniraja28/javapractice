package generics;

import java.util.HashMap;

public class HashMapGenericsRunner {
	// coming to maps two values are there thats way we have to place two wrapper
	// classes

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// OR
		// HashMap<Integer,String> hm = new HashMap<>();
		hm.put(45, "Hello");
		hm.put(9, "majnu");
		hm.put(5, "ram");
		hm.put(5, "ramya");

		HashMap<Integer, Character> hm1 = new HashMap<>();
		hm1.put(2, 'c');
		hm1.put(3, 'f');
		hm1.put(4, 'n');
		hm1.put(1, 'r');
		

		
		System.out.println(" hash map hm " + hm);
		System.out.println("hash map " + hm1);
		
		

	}

}
