package B_Oops_concepts;

import java.util.Random;

public class E_Multidimensional_Arrays {

	public static void main(String[] args) {

		
/*		  Creating multi dimenesional array with 3 rows and 5 columns;
		  
		  int num [][] = new int [2] [3]; //[2]- represents No.of sections/Rows:
		                                  // [3]- represents No.of elements in array.
		  num [0][0]= 3;
		  num [0][1]= 6;
		  num [0][2]= 5;
		  num [1][0]= 9;
		  num [1][1]= 1;
		  num [1][2]= 0;
		  
		  
//		  for(int j=0; j<2;j++) {                // outer loop: To print no.of sections
//		    System.out.print("Section "+j +" = "); 
//		       for (int k=0; k<3; k++) {         // Inner loop to print the all elements in array
//		          System.out.print(num[j][k]+" "); 
////		          System.out.print("Index value of "+ k +" = "+ num[j][k]);  
//		        }
		  System.out.println(num[0][1]);*/
		  
		 
/* 2nd Method: Creating multi dimensional array with randomly generated numbers
		int num[][] = new int[5][9];

		// int random =(int) Math.random(); //math:Java class built in function for provides various mathametical functions
		                                   //Rondom- Method of math class to generate the in decimal numbers or double datat type value(lessthan 1.0.
		                                  // multiplied by 10/100/1000 to convert 0.0 to larger decimal (05 *10=5.0)
		                                 // int - Used to type cast the decimal number to integer (5.0 to 5).

		// For generating random number and assiging to arrays.
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 9; k++) {
				num[j][k] = (int) (Math.random() * 10); // this syntax link different from both for loops.
			}
		}
	    // Using normal for loop to print the generated values
		for (int j = 0; j < 5; j++) {                   // outer loop: To print no.of sections
			System.out.print("Section " + j + " = { ");
			for (int k = 0; k < 9; k++) {              // Inner loop to print the all elements in array
				System.out.print(num[j][k] + ", ");
			}
			System.out.println("}");

		}
        //Using Enhanced for loop to print thegnerated values.
		for (int[] a : num) {
			for (int b : a) {

				System.out.print(b + " ");

			}
			System.out.println();

		}
		}*/
//3rd Method: Creating multi dimensional array with randomly generated numbers between the max and min sizes
		int roworsections = 3;
		int columns = 7;
		int max = 2;
		int min = 9;
		
		int num[][] = new int[roworsections][columns];

		// int random =(int) Math.random(); //math:Java class built in function for provides various mathametical functions
		                                   //Rondom- Method of math class to generate the in decimal numbers or double datat type value(lessthan 1.0.
		                                  // multiplied by 10/100/1000 to convert 0.0 to larger decimal (05 *10=5.0)
		                                 // int - Used to type cast the decimal number to integer (5.0 to 5).

		// For generating random number and assiging to arrays and printing here .
		for (int j = 0; j < roworsections; j++) {                            // outer loop: To print no.of sections
			     System.out.print("Section " + j + " = { ");
			  for (int k = 0; k < columns; k++) {                         // Inner loop to print the all elements in array
				    num[j][k] = (int) (Math.random() * (max-min+1)+ min); // this syntax link different from both for loops.
				    System.out.print(num[j][k] + ", ");
			}
			  System.out.println("}");
		}

		System.out.println("");
		System.out.println("Using Enhanced for loop:");
        //Using Enhanced for loop to print thegnerated values.
		for (int[] a : num) {
			
			for (int b : a) {

				System.out.print(b + ",");

			}
			System.out.println();

	}
}
}
