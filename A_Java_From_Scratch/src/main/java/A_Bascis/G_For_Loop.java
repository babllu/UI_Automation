package A_Bascis;

public class G_For_Loop {
	
	public static void main (String [] args) {
		
		/*for (int i=1;i<=5;i++) {  // initilization ; condition; incre/drecrement
			
			System.out.println("Hi Abhishek" + i);
			
		}*/
		
/*	next for loop :
			
			for (int i=1; i<=5; i++) {
				
				System.out.println("Day"+ i);
				
				for (int j=9; j<=17; j++) {
					System.out.println(j  + "-"+ (j+1));
					
				}
				
			}
	*/
			
			for (int i=0; i<3; i++) // First outter loop will execute with inner loop
				  {
					for (int j =0; j<10;j++) // In Inner loop , once the J reaches or equal to 9 , then will jumps from loop and executes the outerloop i.        
					   { 
						  System.out.print(i+ "" +j+" ");
					          if(j==9) {
						          break;
							
		}
	}

}}}
