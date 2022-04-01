package exceptions;

public class CustomExceptionRunner {

	public static void main(String[] args) {

		User u1 = new User();
		u1.setName("ramesh");
		u1.setGeneder('M');
		u1.setAge(25);

		User u2 = new User();
		u2.setName("swapna");
		u2.setGeneder('f');
		u2.setAge(18);

		User u3 = new User();
		u3.setAge(22);
		u3.setGeneder('f');
		u3.setName("ramya");
		
		User u4 = new User();
		

		if (u1.getAge() >= 18) {
			System.out.println("User1 are eligible for vote registartaion");
		} else {
			UserNotEligibleForRegistartionException unefre = new UserNotEligibleForRegistartionException(
					"User1 are not eligible for vote registartaion");
			throw unefre;
		}

		if (u2.getAge() >= 18) {
			System.out.println("User2 are eligible for vote");
		} else {
			UserNotEligibleForRegistartionException unefre = new UserNotEligibleForRegistartionException(
					"User2 are not eligible for vote registartaion");
			throw unefre;
		}
		if (u3.getAge() >= 18) {
			System.out.println("user3 is elgibile for vote");
		} else {
			UserNotEligibleForRegistartionException unefre = new UserNotEligibleForRegistartionException(
					"User3 are not eligible for vote registartaion");
			throw unefre;

		}

	}

}

 class User {

	private String name;// state or fields or properties
	private int age;
	private char geneder;

	public String getName() {
		return name;
	}

	public void setName(String name) {// generate setters and getters method
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGeneder() {
		return geneder;
	}

	public void setGeneder(char geneder) {
		this.geneder = geneder;
	}

	@Override
	public String toString() {// to string method override
		return "User [name=" + name + ", age=" + age + ", geneder=" + geneder + "]";
	}

}

// creating own exception class 
class UserNotEligibleForRegistartionException extends RuntimeException {

	public UserNotEligibleForRegistartionException() {// generate conostructor from super class
		super();
	}

	public UserNotEligibleForRegistartionException(String message) {
		super(message);

	}

}