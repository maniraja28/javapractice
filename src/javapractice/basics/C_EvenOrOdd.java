package javapractice.basics;

public class C_EvenOrOdd {//class name should be camel case convention

	// 3 - odd
	// 2 - even
	// 15 - odd 3 - odd
	

	public static void main(String[] args) {

		// if any  number is divisble by 2 and which gives remainder is ZERO then it is EVEN number
		// or else ODD number

		int a =90;//variable decleration or initilization

		if (a % 2 == 0) {//condition
			System.out.println(a + " is Even number");
		} else {//we are used in if else statements condition or logic is write in if statement only 

			System.out.println(a + " is Odd number");
		}

//	int c = a/2;
		
//	System.out.println(c);

	}
}
