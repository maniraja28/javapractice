import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> ilist = new ArrayList<>();

		ilist.add(10);
		ilist.add(11);
		ilist.add(15);
		ilist.add(34);
		ilist.add(55);
		ilist.add(123);
		ilist.add(232);

//		List<String> sList = new ArrayList<>();
//
//		for (int i = 0; i < ilist.size(); i++) {
//
//			String s = ilist.get(i) + "@";
//			sList.add(s);
//
//		} // imperative Style
		
		
	List<String> sList = ilist.stream().map(i -> i+"@").collect(Collectors.toList());
		

		System.out.println(sList);

	}
}
