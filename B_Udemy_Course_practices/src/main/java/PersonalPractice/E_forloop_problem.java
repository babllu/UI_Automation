package PersonalPractice;

public class E_forloop_problem {
	public static void main (String [] args) {
		
		for (int i=0; i<3; i++) {// First outter loop will execute with inner loop
			for (int j =0; j<10;j++) { // In Inner loop , once the J reaches or equal to 9 , then will jumps from loop and executes the outerloop i.
				System.out.print(i+ "" +j+" ");
				if(j==9) {
					break;
				}
			}
		}
		
	}
			

}
