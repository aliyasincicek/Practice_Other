package exercise01_Array;

public class Array10x10sekil {

	public static void main(String[] args) {
		/* A�a��daki tabloyu yazd�racak bir Java program� yaz�n�z.
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 0 0 0 0 0 0 0 0 0 0 
		 
		 // String bi�imlemek i�in %s kullan�l�r
        // Tam Say�lar� bi�imlemek i�in %d kullan�l�r
        // Ondal�kl� Say�lar� bi�imlemek i�in %f kullan�l�r
         * d	decimal (10 tabanl�) tam say�lar� string olarak yazar
         * 
		 */
		
		int [][] array = new int[10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf("%2d", array[i][j]);
				
				
			}
			System.out.println();
		}

	}

}
