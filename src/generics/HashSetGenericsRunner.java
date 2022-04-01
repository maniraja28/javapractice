package generics;

import java.util.HashSet;
//generics are homogenous type same type of data will add for the purose of compile time safety

public class HashSetGenericsRunner {
	public static void main(String[] args) {
		HashSet<Double> hs = new HashSet<>();
		hs.add(345.555);
		hs.add(111.11);
		hs.add(345.222);
		hs.add(111.11);
		
		HashSet<String>hs1 = new HashSet<>();
		hs1.add("ramu");
		hs1.add("durga");
		hs1.add("mahesh");
		hs1.add("mahesh");
		System.out.println("Hashset hs " + hs);
		System.out.println("Hashset hs1 " + hs1);
	}

}
