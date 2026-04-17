package Java_intermediate_topics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
//		HashMap contains data as Key, Value Pair.
//      Conatins only Unique Value.
//		Not synchronized and no order.
//		Java HashMap may have one null ky and multiple null values.

		HashMap<String, String> hm1 = new HashMap<String, String>();
		
// Adding key and value in HashMap
		hm1.put("Ab", "http://uat.com");
		hm1.put("Abhi", "http://uat1.com");
		hm1.put("Name", "Abhishek ");
		System.out.println(hm1);
		
//Removing key and value in HashMap
		/*
		 * hm1.remove("Abhi", "http://uat1.com"); // Using 'key' can remove the whole
		 * key and value line. hm1.remove("Ab"); // If using both key & value can remove
		 * the line of code , if we give the correct key and value combination
		 * hm1.remove("Ab", "https://uat.com"); System.out.println(hm1);
		 */
//Print the key and value in HashMap
	    //	1. method is for loop
		Set s1= hm1.keySet(); // Keyset is used to print the all the keys present.
		// Using for loop
		for(String key : hm1.keySet()) { //String is used as we used string as the data type, if interger used then it wil integer
			System.out.println("Key is : "+key +" & " +"value is "+ hm1.get(key));
		}
		
		//2 Method is Iteratio:
		Set s2 = hm1.keySet();
		Iterator <String> itr = s2.iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			System.out.println("Key is :" +key+" & "+ "Value is :"+hm1.get(key));
				
			}
		}
}
