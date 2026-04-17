package B_Oops_concepts;

public class D_Arrays {
	
	public static void main (String [] args){

/* 1st method: Directly assigning values.Stating that Num[] variable storing int data type values.	
		
        int num[] = {2,3,4,2,9}; 
 
      // To print single index value of an arrary. printing the 3 index value of anarray. out put =2.
		
		   System.out.println(num[3]); 
		
      // To print all the values at atime. method-1
		
		 System.out.println("Index (0) = "+ num[0]);
		 System.out.println("Index (1) = "+num[1]);
		 System.out.println("Index (2) = "+num[2]);
		 System.out.println("Index (3) = "+num[3]);
		 System.out.println("Index (4) = "+num[4]); 
		 
		 System.out.println();
		 
	  // Printing all lements in an Array using for loop 
		 for (int i=0; i<5; i++){
		 System.out.println("Index ("+i+") = "+ num[i]);
		
	}
	
	
// 2nd Method pf assigning value in an array
    
		int num [] = new int [4];     // initializing 4 array values with zero.
		num[0]= 10;
		num[1]= 20;
		num[2]= 30;
		num[3]= 40;
		
		
      // To print at atime of values in array using for loop. method-2
       
		 for (int i=0; i<=3;i++) {
			 System.out.println("Index ("+ i +") = "+ num[i]);
		 }*/
	
/*3rd Method -- Randomly generating and assigning numbersof eachindex element in an array using random. method 
		 
		 int size =5;
		 
		 int num1[] =new int [size];   
			    
			for(int i = 0; i<size; i++) {
				num1[i]=(int)(Math.random()*10);
					System.out.print( num1[i]+","); 
//			}
//			for (int a:num1) {
//				System.out.print(a +" ");
//				
			}
			System.out.println();*/
		
//Randomly generating and assigning numbers bewtween min and max values for each index element in an array using random. method 
		 
			int size2 = 5;  //initilizing size varibale.
			int min = 50;  
			int max = 150;
			 
			 int num2[] =new int [size2];   
				    
				for(int i = 0; i<num2.length; i++) {
					num2[i]=(int)(Math.random()*(max-min +1)) +min;
//						System.out.print(num1[i]+" "); 
					}
				for (int a:num2) {
					System.out.print(a +" ");
					
				}

	}

}