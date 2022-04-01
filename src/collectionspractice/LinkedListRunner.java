package collectionspractice;

import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {

		// Hetrogenous type (mixed types)
		// insertion order is preserved
		// Duplicates are allowed
		// Middle of insertion or deletions are easy that means adding the data not
		// replacement
		// coming to list and set we are using add methods
		// crud operations are possibile
		LinkedList ll = new LinkedList();
		ll.add(23);
		ll.add(45);
		ll.add(66);// create the data
		ll.add(3);
		ll.add(23);
		ll.add("ravi");
		ll.add(true);
		ll.add('m');

		System.out.println("Before .... " + ll);// read the data
		ll.add(3, "ravi");
		ll.add(2, "raja");// update the data
		ll.add(5, "ravi");// set or add no problem
		ll.add(6, "ravi");
		ll.set(0, "raju");
		System.out.println(ll.get(2));// read
		ll.remove(4);// delete the data
		System.out.println("After .... " + ll);

	}

}
