package exceptions;

public class DivisionDemo {
	// what is the use of exception?
	// exception means any type of problems is occured at the time of program
	// execution time or writing time
	// we fill identify the problem thats means any type of risky code is there on
	// that code we have to place try block
	// on that code recovery purpose we will put catch block
	//exception means any type of problem is occoured during the program execution time or writting time we have to place the risky 
   //code into the try block and this risky code is recoverde by the catch block 
	public static void main(String[] args) {
		try {

			int a = 4;//variabile decleration or initilization
			int b = 0;//any small number is dividede by the big number we will get exception

			int c = a / b; // Risky code that means any thing is divided by zero we wii get a.e
			System.out.println("c value is " + c);
		} 
		catch (Exception e) {
			System.out.println("can't divided by zero because of any number is dividede by zero we will get airthematic exception");
		}
		finally {// finally its not definding upon try catch blocks without execution of try catch
					// block final block is executed
			System.out.println("this is final block");
		}
	}

}
