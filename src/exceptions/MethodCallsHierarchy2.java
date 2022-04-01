package exceptions;

import java.util.ArrayList;
import java.util.List;

public class MethodCallsHierarchy2 {

	public static void main(String[] args) {

		List<String> fruitsList = getFruits();
		System.out.println(fruitsList);
	}

	public static List<String> getFruits() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("fd");

		return list;
	}
}
