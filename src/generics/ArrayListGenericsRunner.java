package generics;

import java.util.ArrayList;

public class ArrayListGenericsRunner {

	public static void main(String[] args) {

		// Generics will add only homogeneous data that means same data
		// will add compile time safety purpose

		// <> -> Angular brackets
		ArrayList<Character> al = new ArrayList<Character>();

		// OR
		// ArrayList<Character> al = new ArrayList<>();
		al.add('f');
		al.add('u');
		
		ArrayList<Boolean> al1 = new ArrayList<>();
		al1.add(true);
		al1.add(false);
		ArrayList<Integer>al2 = new ArrayList<>();
		al2.add(23);
		al2.add(34);
		al2.add(89);
		al2.add(12);
		al2.add(2);
		
		ArrayList<Double>al3 = new ArrayList<>();
		al3.add(345.45);
		al3.add(908.88);
		

//         Wrapper classes	are converted into generics 	
//		int <-> Integer 
//		long <-> Long
//		boolean <-> Boolean
//		char <-> Character
//		float <-> Float
//		double <-> Double
		//char<-> Character
		//byte  Byte
		//short Short

		System.out.println("Arraylist data is.. " + al);
		System.out.println("Arraylist data is.. " + al1);
		System.out.println("Arraylist data is..." + al2);
		System.out.println("Arraylist data is..." + al3);
		

	}
}
