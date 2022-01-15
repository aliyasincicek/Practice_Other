package exercise01_Array;

public class ArrayToplama {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array.
		// Bir dizinin deðerlerini toplayan bir Java programý yazýn.
		
		int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];	
		}
System.out.println(sum);
	}

}
