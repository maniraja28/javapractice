package javapractice.oops.ploymorphism;

public class Addition {

	// overloading or Compile time polymorphism
	// Method name should be same but parameters are differnt is called overloading
	// or compile time polymorphism

	public int add(int a, int b)// method name should be the same but parameters are differnt is nothing but
								// overloading or compile time polymorphism
	{
		return a + b;
	}

	public int add(int a, int b, int c)// method name should be same but parameters are differnt is nothing but
										// overloading
	{

		return a + b + c;
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public int add(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
}
