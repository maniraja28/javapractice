package javapractice.oops.abstraction;

public  abstract class Vehicle {// class name should be abstract in abstract classes in proper completion is nothing but abstraction

	private String number;// state or fields
	private String color;
	private String model;
   //generate setters and getters methods 
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void start() {
		System.out.println("starting..");
	}

	public void stop() {
		System.out.println("stopping...");
	}

	public void brake() {
		System.out.println("brake....");
	}

	@Override // to string method override for the purpose of output generate easily understand by the user
	public String toString() {
		return "Vehicle [number=" + number + ", color=" + color + ", model=" + model + "]";
		}

}

class Bike extends Vehicle {

}

class Car extends Vehicle {

}
class Jeep extends Vehicle{
	
}
