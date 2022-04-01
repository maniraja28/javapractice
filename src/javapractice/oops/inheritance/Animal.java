package javapractice.oops.inheritance;

public class Animal {//acquaring the properties of one class to another class is nothing but inheritance

	private String colour; // state or fields
	private String age;//state

//	
//	public Animal(String color, String age) {//behaviour
//		super();
//		this.color = color;
//		this.age = age; constrour generate
//	}

	public String getColor() {// behaviour
		return colour;
	}

	public void setColor(String colour) {
		this.colour = colour;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Animal is eating...");
	}

	public void speek() {
		System.out.println("Animal is speaking...");// behaviour
	}
	public Animal() {//default conostructor
		
	}

}
