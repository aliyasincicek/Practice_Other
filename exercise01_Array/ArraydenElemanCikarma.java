package exercise01_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraydenElemanCikarma {

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	    System.out.println("Original Array : "+Arrays.toString(my_array));
	    Scanner scan=new Scanner(System.in);
		 System.out.println("arrayden cikarmak istediginiz sayinin indexi icin 0 ile 9 arasinda sayi giriniz");
		 int index=scan.nextInt();
		 
		 if (index==my_array.length-1) {
			 my_array[my_array.length-1]=my_array[my_array.length-3];	
		} 
		 else {
		 for (int i = index; i < my_array.length-1; i++) {
			 {my_array[i]=my_array[i+1]; }
		 }
			 
			 }
		 System.out.println("Arrayin son hali : "+Arrays.toString(my_array));
		 scan.close();
	}

}
