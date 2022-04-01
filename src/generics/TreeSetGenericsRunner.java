package generics;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetGenericsRunner {
	public static void main(String[] args) {
		// tree set or tree map by default natural sorting order will take duplicates are not allowed
		
//	TreeSet<String>ts = new TreeSet<>(Collections.reverseOrder());
	      // or
	TreeSet<String>ts = new TreeSet<>();
	ts.add("111");
	ts.add("9");
	ts.add("8");
	ts.add("7");
	ts.add("6");
	ts.add("111");
	System.out.println("tree set ts " + ts);
	
		
		
	}

}
