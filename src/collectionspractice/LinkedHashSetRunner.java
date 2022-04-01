package collectionspractice;

import java.util.LinkedHashSet;

public class LinkedHashSetRunner {

	public static void main(String[] args) {

		// Hetro (mixed types)
		// insertion order is preserved ** means same order
		// Duplicates are not allowed
		// crud operations
		// only two operations is possibile in set create the data delete the data C or
		// D
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(32);// create the data
		lhs.add(4);
		lhs.add(1);
		lhs.add("hello");
		lhs.add(59);
		lhs.add(2);
		lhs.add(4);
		lhs.add(91);
		lhs.add(1);
		lhs.add("Hello");
		lhs.add(4);
		
		lhs.contains(4);
		System.out.println("before removal " + lhs);
		lhs.remove(32);
		System.out.println("after removal " + lhs);

	}
}
