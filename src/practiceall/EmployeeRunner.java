package practiceall;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee e1 = new Employee();
//		Employee e2 = new Employee("101", "JOhn1", "Hyd1");
//		Employee e3 = new Employee("102", "JOhn2", "Hyd2");
		
		e1.setId("100");
		e1.setName("John");
		e1.setAddress("HYd");

		System.out.println("employee 1 data before address change is.... " + e1);
		
		e1.setAddress("Banglore");
		
		System.out.println("employee 1 data After address change is.... " + e1);

	}

}
