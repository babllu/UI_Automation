package Java_intermediate_topics;

import java.util.Vector;

public class JavaCollections {
	
	public static void main (String [] args) {
	}
	public static void vectorone() {
	
	Vector v1 = new Vector();
	v1.add("Abhishek");
	v1.add("Akshay");
	v1.add(0, "Abhi");
	
	System.out.println("size:"+v1.size());
	System.out.println("capcity:"+v1.capacity());
	}

	public static void vectortwo() {
	Vector v2 = new Vector();
	v2.add(0, "Abhishek");
	v2.add("Abhi");
	
	System.out.println("size:"+v2.size());
	System.out.println("capcity:"+v2.capacity());
	}
}
