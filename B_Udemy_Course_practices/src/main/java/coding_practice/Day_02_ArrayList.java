package coding_practice;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Day_02_ArrayList {
	
	/**
	 * @param args
	 */
	public static void main (String [] args) {
		
		List < String> arr= new ArrayList<String>();
		arr.add("Abhishek");
		arr.add("Abhi");
		arr.remove("Abhi");
		arr.add("Abhishek G");
		
//		To print all the elements from ArrayList using for loop
		for(int i=0; i<arr.size(); i++) 
		{
		System.out.println(arr.get(i));
		}
		
//	To print all the elements from ArrayList using Ehnaced for loop	
		for (String sr: arr)
		{
			System.out.println(sr);
		}
//		to check element present in arrayList
		System.out.println(arr.contains("Abhishek"));
		System.out.println(arr.indexOf("Abhishek G"));
		
		System.out.println("********************************************************");
		
//		To convert array into arraylist
		String[] array = {"String","Selenium", "Java","Python"}; //---------> Traditional array
		List<String> arrlist = Arrays.asList(array);        //
		System.out.println(arrlist.contains("Java"));
		
		
		for(String sa: arrlist) 
		{
			System.out.println(sa);
		}
		
		for (int i=arrlist.size()-1; i>=0;--i) 
		{
			 System.out.println(arrlist.get(i));
		}
	}
}
