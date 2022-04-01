import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();// Generics will add only same type of data

		map.put(24, "hari");
		map.put(31, "mahesh");
		map.put(44, "ramesh");
		map.put(3, "suresh");
		map.put(24, "raja");

		System.out.println(map);

		// by using java8 streams
		// map.forEach((k,v) -> System.out.println(k+" : "+v));//map.forEach(k,v) ->
		// System.out.println(k+":"+v);
//map.stream().forEach(k,v) -> System.out.println(K+" : " + V);
		// map.stream().forEach(k,v) -> Systeam.out.println(K+":"+V);
		//map.forEach((k, v) -> System.out.println(k + ":" + v));
		map.forEach((k,v) -> System.out.println(k +":"+v));
		
	}

}
