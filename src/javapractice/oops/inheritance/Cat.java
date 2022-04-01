package javapractice.oops.inheritance;

//Inheritance - IS-A relationship (extends) one class  can extend the properties of another class is nothing but inheritance
//Cat (C) is a Animal (P)
//overriding means defining a method in child class by using the same sigunature of the same method in parentclass is nothing but overring or runtimepolymorphism
public class Cat extends Animal{

	@Override
	public void speek() {
		System.out.println("Meow Meow...");// behaviour
	}

	@Override
	public String toString() {
		return "Cat [getColor()=" + getColor() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
