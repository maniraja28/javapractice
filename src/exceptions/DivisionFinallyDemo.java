package exceptions;

public class DivisionFinallyDemo {

	public static void main(String[] args) {

		try {

			int a = 4;//risky code we have to place in try block
			int b = 0;

			int c = a / b; // Risky code because of any thing is divided by zero we will get airthmetic exception
			System.out.println(c);

		} catch (Exception e) {//recover by the catch block
			System.out.println("can't divided by zero");
		} finally {//finally block is not definding upon the try catch block its normally executed

			System.out.println("This is finally block...");
		}
	}
}
