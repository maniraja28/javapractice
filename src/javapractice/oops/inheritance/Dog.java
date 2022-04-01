package javapractice.oops.inheritance;

//Inheritance - IS-A relationship (extends)
// Dog (C) is a Animal (P)
public class Dog extends Animal {
	public void speek() { // Overriding (Runtime Polymorphism)
//overriding means definig a method in "child class" by using the "same sigunature" of the "same method" in parent class is nothing but overriding or runtime polymorphism 
		System.out.println("Bow Bow....");// behaviour
	}
}
