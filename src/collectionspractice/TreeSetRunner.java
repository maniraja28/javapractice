package collectionspractice;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetRunner {

	public static void main(String[] args) {
		// homogenous type ( same type) that means same type of data will be added otherwise we will get the exception in main thread
		// Duplicates are not allowed
		// Default Natural sorting order - Ascending
		// by default ascending order is coming
		// crud operations time only two cases are possibile create the data or delete
		// or remove the data

		// TreeSet ts = new TreeSet(); // By default ascending order
		TreeSet ts = new TreeSet(Collections.reverseOrder()); // descending 
		ts.add(56);// crete the data
		ts.add(2);
		ts.add(17);
		ts.add(1);
		ts.add(9);
		ts.add(1);
		ts.add(56);
		ts.add(100);
		
		

		System.out.println(ts);
		ts.remove(1);// delete the data or remove
		System.out.println("after removal" + ts);

	}

}
