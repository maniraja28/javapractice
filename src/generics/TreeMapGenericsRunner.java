package generics;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapGenericsRunner {
	public static void main(String args[]) {
		//TreeMap<Integer,String>tm = new TreeMap<>();

		TreeMap<Integer,String>tm = new TreeMap<>(Collections.reverseOrder());
		tm.put(9, "mahesh");
		tm.put(12, "suresh");
		tm.put(13, "ramesh");
		System.out.println("TreeMap " + tm);
		
		
	}

}
//
