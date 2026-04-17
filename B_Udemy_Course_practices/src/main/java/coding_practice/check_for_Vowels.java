package coding_practice;

public class check_for_Vowels {

	public static void main(String[] args) {
		
		char c = 'x';
		
		String r;
		
		switch (c) {
			case 'a','e','i','o','u' -> r ="vowel";
			default -> r= "not vowels";
			
		}
			System.out.println(r);

	}

}
