package collectionspractice;

import java.util.LinkedHashMap;

public class LinkedHashMapRunner {
	// insertion order is preserved that means same order
	// duplicates are not allowed
	// if the key value is same on that time latest value is coming in output
// crud operations are possible
	public static void main(String[] args) {

		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(23, "ted");// create the data
		lhm.put(1, "jack");
		lhm.put(4, "rosey");
		lhm.put(2, "naresh");
		lhm.put(1, "ram");
		lhm.put(10, "je");
		lhm.put(11, "te");
		lhm.put(1, "mosh");

		System.out.println(lhm);// read the data
		System.out.println("index number 4 " + lhm.get(4));// read the data
		lhm.replace(11, "tarun");// replace or update the data
		System.out.println("after replace " + lhm);
		lhm.remove(10);// remove or delete the data
		System.out.println("after removal " + lhm);

	}
}
