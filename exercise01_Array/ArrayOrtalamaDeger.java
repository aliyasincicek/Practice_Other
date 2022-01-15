package exercise01_Array;

public class ArrayOrtalamaDeger {

	public static void main(String[] args) {
		// Dizi elemanlarýnýn ortalama deðerini hesaplayan bir Java programý yazýnýz.
		
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		for (int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		double average=sum/numbers.length;
System.out.println("Arrayin ortalama degeri : "+ average);
	}

}
