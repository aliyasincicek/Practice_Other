package exercise01_Array;

public class Array10x10sekil {

	public static void main(String[] args) {
		/* Aþaðýdaki tabloyu yazdýracak bir Java programý yazýnýz.
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
		 
		 // String biçimlemek için %s kullanýlýr
        // Tam Sayýlarý biçimlemek için %d kullanýlýr
        // Ondalýklý Sayýlarý biçimlemek için %f kullanýlýr
         * d	decimal (10 tabanlý) tam sayýlarý string olarak yazar
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
