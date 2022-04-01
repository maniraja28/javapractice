package java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("fish");
		list.add("octopus");
		list.add("fish");
		list.add("crab");
		list.add("octopus");
		list.add("crab");
		list.add("crab");
		list.add("fish");
		list.add("prawn");
		
		//System.out.println("original list is ..... "+list);
		//create  + process + consume
//		list.stream()
//			.filter(data -> data.equals("fish"))
//	        .forEach( System.out::println);
		//convert all list names into upper case and into a list
	List<String>uppercase	= list.stream()
		//.map(list-> list.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(uppercase);
		
	}

}
