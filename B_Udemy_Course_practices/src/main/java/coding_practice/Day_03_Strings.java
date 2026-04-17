package coding_practice;

import java.util.Arrays;
import java.util.List;

public class Day_03_Strings {
	public static void main(String[] args) {

// String is an class.
		String sr = "Abhishek"; // --------------> String literal
		String sr2 = "Abhishek";

// Using new keyword, object creation
		String s = new String("Abhi shek");
		System.out.println(s);
		
//Print the each character of string.
		System.out.println("***************Priniting Each char from the String:");	
		for(int j =0; j<s.length(); j++) 
			
		{	
			System.out.println(s.charAt(j));
			//System.out.print(s.charAt(j));
			
		}
		
		System.out.println("***************Priniting Each char from the String in Reverse direction:");	
         for(int j =s.length()-1;j>=0; --j) 
			
		{	
			System.out.println(s.charAt(j));
 			//System.out.print(s.charAt(j));
			
		}
		String sa = new String("Hi Abhishek! Split the given string");
//		Before spliiting String
		System.out.println("************************Before spliiting String : " + sa);
		
//		Splitting string using the delimeter as "white Space" and converting into String array.
		String [] splittedString = sa.split(" ");
		
//		 Index value is required to print an String array
//		 System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[2]);
//		System.out.println(splittedString[3]);
//		System.out.println(splittedString[4]);
//		System.out.println(splittedString[5]);
		
//		Printing all the values from the String array using for loop
		for (int i =0; i<splittedString.length;i++) 
		{
			System.out.println(splittedString[i]);
		}
		
//		Print all the values from the String array using for loop in reverse order
		for (int i =splittedString.length-1;i>=0;i--) 
		{
			System.out.println(splittedString[i]);
		}
		
//		Convert and Store that String array into a List 
		List<String> spl=Arrays.asList(splittedString);
		System.out.println(spl);
		
		
		

		
	}

}
