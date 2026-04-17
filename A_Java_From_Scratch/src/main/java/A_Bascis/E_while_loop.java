package A_Bascis;

public class E_while_loop {
	
	public static void main(String [] args) {
//		While loop:
	/*	 int i =1;
		 
		while (i<=5) { // Loop will start from the value assigned to variable.(i). 
//			In while loop,the given condition will be checked first.If condition is true,wil executes the loop body.then update/increment/decrement. 
//			agin checks the condition and execute the loop, till the condition becomes false. once condition is false , it will come out ofthe loop.
			
			System.out.println("Hi Abhishek  " +i);
			i++;
	
		} System.out.println("How are you ?");
		*/
		
		
		
//		 Nested while loop: Using loop in while loop. 
		
		int i=1;
		 while (i<=30) {
			 
			 System.out.println(" ");
			 System.out.println(i  +"  Day");
			 
			     int j=1;
			     while (j<=24) {
				        System.out.print(" "+j);
				 j++;
			 }
			 i++;
			 
		 }
		
		
	}

}
