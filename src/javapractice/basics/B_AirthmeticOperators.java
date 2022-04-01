package javapractice.basics;//package name

public class B_AirthmeticOperators {//class name should be meaningful about the program
	
	// + - * / % 
	// / - divisable operator which gives  (quoficient)
	// %  Modulo operator which gives (remainder)
	
	
	// quoficent example= 16/2 - 8 
	//remainder example = 16%2 - 0
	
	public static void main(String[] args) { //main method
		
		int a = 10;//varaiable deleration or initilization
		int b = 20;//variable initilization;
		
		System.out.println(a+b); // 30 
		System.out.println(a-b); //-10
		System.out.println(a*b); //200
		System.out.println(a/b); //0 any big number is dividede by small number on that case quoficient should be zero
		System.out.println(a%b);// 10
	}
	
	

}
