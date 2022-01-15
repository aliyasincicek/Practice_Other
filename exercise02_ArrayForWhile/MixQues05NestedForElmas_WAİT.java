package exercise02_ArrayForWhile;

import java.util.Scanner;

public class MixQues05NestedForElmas_WAÝT {

	public static void main(String[] args) {
		/*
		5-----Aþaðýdaki elmas deseni görüntüsünü çizen java kodunu yazýnýz.
	    Test Data:
	    Yarým elmas uzunluðu : 7
	    Beklenen Çýktý:
	          *
	         ***
	        *****
	       *******
	      *********
	     ***********
	    *************
	     ***********
	      *********
	       *******
	        *****
	         ***
	          *
	      ************************************************************************/
		Scanner Keyboard = new Scanner (System.in); //New scanner 
		System.out.println("Enter the Symbol you wish to use: "); //Prompt user symbol input
		String symbol1 = Keyboard.next(); // Capture user input

		    for (int i=0 ; i<5 ; i++){ //Begin for loop - increase until int is 5 long
		        for (int k=8 ; k > i ; k--){ //nested loop - decrease space before int "i" (inverted invisible triangle)
		            System.out.print(" "); //print space from nested loop before symbol1 
		        }
		        for (int j=0; j<=i; j++){ //nested loop - increase "j" until is equal to "i" 
		            System.out.print(symbol1 + " "); //print symbol1 + space to form diamond
		        }
		        System.out.println(); //print above nested loop line by line

		    } //begin new loop - inverted triangle

		    for (int m = 4 ; m > 0 ; m--){ //decrease symbol by 1
		        for (int n = 8 ; n >= m ; n--){ //match increase of space "invisible" triangle next to symbol to form upside down triangle
		            System.out.print(" "); //print "invisible" triangle
		        }
		        for (int q = 0 ; q < m ; q++){ //nested loop to decrease symbol entered by user
		            System.out.print(symbol1 + " "); //print inverted triangle made of user's input
		        }

		        System.out.println(); //print the loop in new line.
	}

	}
}