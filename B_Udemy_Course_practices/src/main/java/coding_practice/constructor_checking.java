package coding_practice;

public class constructor_checking {
	        String name;
			int age ;
	
		constructor_checking  (String n, int a) {
			
			name = n;
			age = a;
			
			}

	public static void main(String[] args) {
		
		constructor_checking c = new constructor_checking ( "Abhishek", 18);
		 System.out.println(c);

	}

}
