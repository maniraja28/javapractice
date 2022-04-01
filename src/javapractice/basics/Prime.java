package javapractice.basics;

import java.util.stream.IntStream;

public class Prime {
	public static void main(String[] args) {
		// prime number means any number is divisible with one and given number is nothing but prime number
	
		int n = 17;
		boolean check = true;
	
		for (int i = 2; i < n ; i++) {
			if (n % i == 0) {
				System.out.println(n + " is not a prime number");
				check = false;
				break;
			}
		}
		
		if(check)
		{
			System.out.println(n + " is  a prime number");
		}
		
		
		
//		boolean result = IntStream.rangeClosed(2, n-1).anyMatch(x -> n%x==0);
//		if(result)
//		{
//			System.out.println(n + " is not prime");
//		}else {
//			System.out.println(n + " is  prime");
//		}

	}
}