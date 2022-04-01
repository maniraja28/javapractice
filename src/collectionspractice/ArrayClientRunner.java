package collectionspractice;

public class ArrayClientRunner {
	
	
	//Arrays are Homogenous declare varibles are must be  the same
	// Fixed in size 
	// Not growable or not dynamic
	// Duplicates allowed and  insertion Order is preserved
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[5]; // Homogeneous ( same type)
		arr[0] = 6;
		arr[1] = 5;
		arr[2]=10;
		arr[3]=15;
		arr[4]=15;
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		
		String str[] = new String[2];
		
		str[0] = "hello";
		str[1] = "world";
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
				
		
		
	}

}
