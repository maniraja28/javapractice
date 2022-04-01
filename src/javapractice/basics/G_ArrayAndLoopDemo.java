package javapractice.basics;

public class G_ArrayAndLoopDemo {

	// array

	public static void main(String[] args) {

		int a[] = new int[6]; // empty basket

		a[0] = 10; // store
		a[1] = 5;
		a[2] = 6;
		a[3] = 15;
		a[4] = 9;
		a[5] = 22;
		a[4] = 32;

		// System.out.println(a[2]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
