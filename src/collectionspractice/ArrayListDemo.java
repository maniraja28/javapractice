package collectionspractice;

import java.util.ArrayList;
//insertion order is preserved,duplicates are allowed,middle of insertion or deletions are complex
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<>();
		
		al.add("ramesg");
		al.add("suresh");
		al.add("mahesh");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
				
	}

}
