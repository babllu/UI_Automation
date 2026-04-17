package B_Oops_concepts;

public class G_Enhanced_for_loop {
	
	public static void main (String [] args) {
		
		int [] numbers = new int[3];
		
		numbers[0]=4;
		numbers[1]=9;
		numbers[2]=7;
//		
//		for (int i =0; i<3; i++) {    //Normal for loop 
//			
//			System.out.print(numbers[i]+" ");
//		}
//		System.out.println();
		
		//Enhanced for loop 
		 for (int n: numbers) {
			 System.out.println(n);
			 
		 }
		
		
	}

}
