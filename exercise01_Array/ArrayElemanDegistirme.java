package exercise01_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanDegistirme {

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	    System.out.println("Original Array : "+Arrays.toString(my_array));
	    Scanner scan=new Scanner(System.in);
		 System.out.println("arrayden degistirmek istediginiz sayinin indexi icin 0 ile 9 arasinda sayi giriniz");
		 int index=scan.nextInt();
		 System.out.println("eklemek istediginiz sayi degerini yaziniz");
		 int newValue=scan.nextInt();
		 
		 if (index==0) {
			 my_array[0]=newValue;	
		} 
		 else {
		 for (int i = my_array.length-1; i > index; i--) {
			 {my_array[i]=my_array[i-1]; }
		 }
			 my_array[index]=newValue;
			 
			 }
      System.out.println("New Array: "+Arrays.toString(my_array));
	}

}
