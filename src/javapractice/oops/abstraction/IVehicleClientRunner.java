package javapractice.oops.abstraction;

public class IVehicleClientRunner {

	public static void main(String[] args) {

		Maruti m = new Maruti();
		m.start();
		m.brake();
		
		Audi a = new Audi();
		a.brake();
		a.stop();
	}
}
