package javapractice.oops.abstraction;

 public interface IVehicle {

	// Specification
	void start();//method declaration

	String stop();

	void brake();

}

class Maruti implements IVehicle {


	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brake() {
		System.out.println("braking.....");
	}

	
		
		
	}




class Audi implements IVehicle {

	@Override
	public void start() {
		System.out.println("audi car is strting");
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brake() {
		System.out.println("audi car is stopping");
	}

	
}

