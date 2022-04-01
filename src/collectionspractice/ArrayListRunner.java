package collectionspractice;

import java.util.ArrayList;

public class ArrayListRunner {
	

	public static void main(String[] args) {
        // List rules  two types theay are
		//1.array list 
		//2.linked list
		//3.vector list
		//add methods are used list and set methods
		// Hetrogenous type(mixed types)
		// insertion order is  preserved same ordered
		// Duplicates are allowed
		// Middle of insertion or deletions are complex (will take more time)
		// crud operations
		// C for create the data or adding
		// R for read the data or get the data
		// U update the data or  set the data
		// D delete or remove the data
		
		ArrayList al = new ArrayList();//object creation
		
		// Creation/Save -> C RUD//adding
		al.add(16);
		al.add("Malaysiya");
		al.add(true);
		al.add('g');
		al.add(2);
		al.add(12);
		al.add("Malaysiya");
		al.add(9);
		al.add(2);
		al.add(true);
		
	al.set(5, 24); // replace or update U
		al.set(1, "ravi");

		System.out.println("Before removal..... "+ al); // R
		
		al.remove(3); // 3 is index  // Deletion / removes
		
		System.out.println("After removal..... "+ al);
		
		//System.out.println(al.get(6)); // Reading / getting
		
	    //System.out.println(al.contains(12)); // having or not
		//System.out.println(al.contains(2));
		//crud operations are possibile 1.create the data that means add the data 2.read the data get the data
		//update the data set the that means already existing the data 4.remove the data delete the data	


	}
	
	
	

}
