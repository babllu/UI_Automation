package Basics;

public class Daytwo_loops_in_arrays {

	
	  public static void main(String[] args) { 
		  // TODO Auto-generated method stub
	  
	  //IF , ELSE IF and ELSE SATATEMENT:
	  
	  int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17 };
	  
	  for (int i = 0; i < array.length ; i++){
		  
		  if (array[i] % 2 == 0) {
	  System.out.println(array[i] + " " + "is multiple of 2");
	  } 
	  else if(array[i]% 3 == 0) {
	  System.out.println(array[i] + " " + "is multiple by 3"); 
	  } 
	  else {
	  System.out.println(array[i] + " " + "is not multiple of 2 & 3");
	  } 
	  }
	  
// while loop 
	  int k = 0;{
	   while (k < 12) {
		  k++; 
	   System.out.println(k + " - " +" HEY! ABHI"); 
	  }
	  }
// DO LOOP:
	   int l = 0; 
	   do { System.out.println(l + " : " + "Hi Abhishek");
	   l++; }
	   while (l <= 15);}
   

}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
		/*
		 * public void statement(){
		 * 
		 * //IF , ELSE IF and ELSE SATATEMENT:
		 * 
		 * int[]array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		 * 
		 * for (int i=0; i<array1.length ; i++) { if (array1[i]% 2 == 0) {
		 * System.out.println(array1[i] + " " + "is multiple of 2"); } else
		 * if(array1[i]%3==0) { System.out.println(array1[i]+" " + "is multiple by 3");
		 * }else{ System.out.println(array1[i]+ " " + "is not multiple of 2 & 3"); }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * //while loop public void loop(){
		 * 
		 * int k = 0; {
		 * while (k < 10){
		 * k++; 
		 * System.out.println(k +" - "+" HEY! ABHI");
		 * }
		 * } 
		 * // DO LOOP: 
		 * public void doloop() { 
		 * int l=1; 
		 * do { System.out.println(l +
		 * " -"+" Hi Abhishek"); l++; 
		 * }while(l <=10);
		 * } }
		 */ 
