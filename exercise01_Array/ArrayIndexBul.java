package exercise01_Array;

import java.util.Scanner;

public class ArrayIndexBul {

	public static void main(String[] args) {
		// Bir dizi öðesinin dizinini bulan bir Java programý yazýn.
		
		 int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 Scanner scan=new Scanner(System.in);
		 System.out.println("sayi giriniz");
		 int sayi = scan.nextInt();
		 System.out.println(findIndex(array,sayi));
		 scan.close();

	}

	private static int findIndex(int[] array, int sayi) {
		
		if (array==null) { return -1; }
		
		int count=array.length;
		int index = 0;
		
		while (index < count) {
			if (array[index]==sayi) {return index;} 
			else {index++;}
		}
		return -1;
		
		
	}

}
