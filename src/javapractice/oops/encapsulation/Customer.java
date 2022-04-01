package javapractice.oops.encapsulation;

public class Customer { // State+ Behaviour a class consists of state and behaviour is nothing but
						// encapsulation

	private String id; // fields/data/state/ properties
	private String firstName;// state is nothing but variable decleration
	private String lastName;
	private char gender;
	private int age;
	private String address;
	private String mobileno;

	public Customer() { // No-args/no-params constructor from super class 
	}

	public Customer(String id, String firstName, char gender) { // parameterized constructor using fields

		this.id = id;
		this.firstName = firstName;
		this.gender = gender;
	}

//generate setters and getters methods
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {// behavuior is nothing but methods
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	// actions/Behaviours/methods/
	String walk() {

		return "Walking....";
	}

	void buy() {

		System.out.println("Buying....");

	}

	boolean login() {

		return true;

	}

	void sleep() {
		System.out.println("Sleeping....");
	}

	String register() {
		return "345858588";
	}

}
