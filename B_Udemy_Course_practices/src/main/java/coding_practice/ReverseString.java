package coding_practice;

public class ReverseString{
static String str ="Abhishek";
static String rev = "" ;


	public static void main(String[] args) {
		
		for(int i =0; i<str.length(); i++){
			rev = str.charAt(i) +rev; 
		}
		 System.out.println(rev);
			
			



	}

}
