package javapractice.oops.abstraction;

public class VehicleClientRunner {

	public static void main(String[] args) {

		Car c = new Car();
		c.setColor("white");
		c.setModel("ser123");
		c.setNumber("333");

		System.out.println("Car ... " + c);

		Bike b = new Bike();
		b.setColor("red");
		b.setModel("AYX");
		b.setNumber("123");
		System.out.println("Bike...." + b);
		
		Jeep j = new Jeep();//object creation
		j.setColor("red");
		j.setModel("2019");
		j.setNumber("1111");
		System.out.println("Jeep...."+ j);
		

	}

}
