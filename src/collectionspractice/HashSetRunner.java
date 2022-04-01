package collectionspractice;

import java.util.HashSet;

public class HashSetRunner {

	public static void main(String[] args) {

		// Hetro (mixed types)
		// insertion order not preserved
		// Duplicates are not allowed
		// crud operations possible
		//in crud operations time only create the data and remove or delete the data
		//read and update operations are not possibile
		
		
		HashSet hs = new HashSet();

		hs.add(23); // Creation or adding
		hs.add(3);
		hs.add("hello");
		hs.add(78);
		hs.add(2);

		hs.add(781);
		hs.add(3);
		hs.add(17);
		hs.add("hello");
		hs.add(29);
		hs.add("ramaraju");
		
		
		System.out.println( "before removal " + hs);
		System.out.println(" after removal " + hs.remove(229));

		
		System.out.println(hs.contains(29));//contains mean the given object is there or not suppose is there true or false

	}

}
