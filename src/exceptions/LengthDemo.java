package exceptions;

public class LengthDemo {

	public static void main(String[] args) {
        //if any exception is occoured on your exception on that time we have to use try catch blocks
		// client requirement time we have a little bit a idea that code is risky code
		// we have to write try catch blocks
		try {

			String s = null;

			System.out.println("string length is  " + s.length()); // Risky code

		} catch (Exception e) {
			System.out.println("String is null..");
		}
		finally {
			System.out.println("this is finally block");
		}

	}

}
