package B_Oops_concepts;

import java.util.Random;

public class F_Jagged_arrays {

	public static void main(String[] args) {
		
		int rows=3;
		int max =9;
		int min =2;
		
		int [][] hel= new int [rows][];
		
		hel [0] = new int [4];
		hel [1] = new int [3];
		hel [2] = new int [5];
		
		
		
		
		Random random = new Random();
		
		for(int i =0; i < rows ; i++) {
			 for( int k =0; k< hel[i].length ; k++) {
				 hel[i][k]= random.nextInt((max-min)+1)+min;
				 System.out.print(hel[i][k]+ " ");
				 
			 } System.out.println ();
			 
		}
		
		
	}

}
