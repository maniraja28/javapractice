package javapractice.oops.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.setAge("1M");
		d1.setColor("brown");
		d1.speek();

		Dog d2 = new Dog();
		d2.setAge("2Y");
		d2.setColor("white");

		Dog d3 = new Dog();
		d2.setAge("3y");
		d2.setColor("black");

		Cat c1 = new Cat();
		c1.setAge("2M");
		c1.setColor("black");
		c1.speek();
		

		Cat c2 = new Cat();
		c2.setAge("1Y 1M");
		c2.setColor("red");
		
		
		System.out.println("C2 objecet is.... "+c2); 
		
		// or 
		System.out.println("C2 objecet is.... "+c2.toString());


		Cow cow1 = new Cow();
		cow1.setAge("10 y");
		cow1.setColor("red");
		
		Cow cow2 = new Cow();
		cow2.setAge("23 y");
		cow2.setColor("green");

		System.out.println("Dog d1 age is " + d1.getAge());

		System.out.println("Dog d1 color is " + d1.getColor());
		System.out.println("Dog d3 color is " + d3.getColor());

		System.out.println("Cat c1 age is " + c1.getAge());

		System.out.println("CAt c1 color is " + c1.getColor());
		System.out.println("Cow cow1 color is " + cow1.getColor());
		System.out.println("Cow cow1 age is " + cow1.getAge());
		System.out.println("Cow cow2 color is " + cow2.getColor());
		
		Horse h1 = new Horse();
		h1.setAge("10y");
        h1.setColor("brown");
        System.out.println("Horse h1 color is " + h1.getColor());
	}
}
