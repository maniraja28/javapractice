package exceptions;

public class MethodCallsHierarchy {

	public static void main(String[] args) {

		System.out.println("Main() starts");
		m1(); // calling to m1 method   
		System.out.println("Main() ends");

	}

	public static void m1() { 

		System.out.println("m1() starts");
		m2();
		System.out.println("m1() ends");
	}

	public static void m2() {

		System.out.println("m2() starts");
		m3();
		System.out.println("m2() ends");

	}

	public static void m3() {

		System.out.println("m3() starts");

		int a = 3;
		int b = -5;
		System.out.println("C value is .. " + (a - b));

		System.out.println("m3() ends");

	}
}
