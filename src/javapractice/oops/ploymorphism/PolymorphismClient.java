package javapractice.oops.ploymorphism;

public class PolymorphismClient {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
	
		int result = a1.add(1, 3);
		System.out.println("result is " + result);
		
		int result1 = a1.add(10, 10, 20);
		System.out.println("result1 " + result1);
	
		int result2 = a1.add(1, 2, 3, 4);
		System.out.println("result2 is " + result2);
		
		int result3 = a1.add(2, 4, 6, 8, 10);
		System.out.println("result3 is " + result3);

	}
}
