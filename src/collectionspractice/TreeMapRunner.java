package collectionspractice;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapRunner {

	public static void main(String[] args) {
		// growable in size,insertion order is not preserved
        //heterogenous type same type
		// Duplicates are not allowed (keys)
		// Default Natural sorting order - Ascending (keys)
		// crud operations
		TreeMap tm = new TreeMap();// object creation
		// TreeMap tm = new TreeMap(Collections.reverseOrder());
		tm.put(23, "abc");// create the data
		tm.put(3, "bc");
		tm.put(13, "rbc");
		tm.put(9, "abc");
		tm.put(1, "abc");
		tm.put(23, "xyz");
		tm.put(1, "raja");

		System.out.println(tm.get(23));// read the data
		tm.replace(23, "bhanu");// replace or update the data

		tm.remove(1);
		System.out.println(" after removal " + tm);

		System.out.println(tm);

	}
}
