package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PracticeStreams {

	// private static final String List = null;

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Cherries", "Dates", "Elderberry", "Fig", "Grapes");
		//System.out.println(fruits);

		// 1.Print all the fruits
		// fruits.stream().forEach(fruit -> System.out.println(fruit));
		 //fruits.stream().forEach(System.out::println);
		
		// 2.Print each fruit length

		// fruits.stream().forEach(fruit -> System.out.println(fruit.length()));
		// fruits.stream().forEach(fruit -> System.out.println(fruit.length()));
		// 3.Find fruits whose length/charcount is 5 and print it

//		 fruits.stream()
//		 .filter(fruit -> fruit.length()==5)
//		 .forEach(fruit -> System.out.println(fruit));

		// 4.find all fruits whose length is 5 and store in list

//		List<String> fiveLengthFruits = fruits.stream()
//		 .filter(fruit -> fruit.length()==5)
//		 .collect(Collectors.toList());
//		 System.out.println(fiveLengthFruits);
//		List<String> fivelengthfruits = fruits.stream().filter(fruit -> fruit.length() == 5)
//				.collect(Collectors.toList());
//		System.out.println(fivelengthfruits);

		// 5.convert all fruit names into uppercase and print it.

//fruits.stream()
//			  .map(fruit -> fruit.toUpperCase())
//			  .forEach(fruit -> System.out.println(fruit));
//		fruits.stream()
//		.map(fruit -> fruit.toUpperCase())
//		.forEach(System.out::println);

		// 7.convert all fruit names into uppercase and store into a list
//		List<String> uppercasefruits = fruits.stream() 
//		                                      .map(fruit -> fruit.toUpperCase())
//		                                      .collect(Collectors.toList());
//		System.out.println(uppercasefruits);
//		List<String> uppercasefruits = fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
//		System.out.println(uppercasefruits);
////		 8. find fruits whose length is 5 and then convert to uppercase and get as list	
		List<String> uppercaseandlengthisfive = fruits.stream() 
				.filter(fruit-> fruit.length()==5)
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toList());
	System.out.println(uppercaseandlengthisfive );
//		List<String> uppercaseandlentgthsfive = fruits.stream().filter(fruit -> fruit.length() == 5)
//				.map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
//		System.out.println(uppercaseandlentgthsfive);

		// 4.find all fruits whose length is 5 and store in list
		// List<String> length5String= fruits.stream().filter(fruit ->
		// fruit.length()==5).collect(Collectors.toList());

		// 5.convert all fruit names into uppercase and return as list of fruits
//		List<String> upperCaseFruits= fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
//		System.out.println(upperCaseFruits);
//		System.out.println(fruits);
//		

		// 6. find fruits whose length is 5, convert to uppercase and get as list

		// System.out.println(fruits.stream().filter(fruit ->
		// fruit.length()==5).map(fruit ->
		// fruit.toUpperCase()).collect(Collectors.toList()));

	}
}
       //fruits.stream().filter(fruit-> fruit.length==5).map(fruit->fruit.touppercase()).collect(Collectors.toList()).forEach(fruit->soutpln(fruit);
