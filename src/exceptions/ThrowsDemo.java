package exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		// static -> without "object" creation you want to call method put "static"
		try {
			m1(); // calling to m1 method
		} catch (Exception e) {
			System.out.println("This is exception...");
		}

	}

	public static void m1() throws Exception {

		System.out.println("this is m1 method...");
		m2();

	}

	public static void m2() throws Exception {

		System.out.println("this is m2 method...");
		m3();

	}

	public static void m3() throws Exception {

		System.out.println("this is m3 method...");

		System.out.println(4 / 0);//airthematic exception
		

	}
}
