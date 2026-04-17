package B_Oops_concepts;

class calculator{   //method overloading 
	               //same class, same methods but the different parameters
	public int add(int a, int b) {
		
		int results = a + b;
		return results;
		
	}
	 public int add(int a, int b, int c) {
		 
		 return a+b+c;
	 }
	public int add(int a, int b,int c,int d) {
		
		return a+b+c+d;
		
	}
}

public class B_Method_Overloading {
	
	public static void main (String [] ar) {
		
		calculator cal = new calculator();
	    System.out.println(cal.add(90,98));
		int a2 = cal.add(90, 98, 12);
		int a3 = cal.add(90, 98, 12, 13);
		System.out.println(a2);
		System.out.println(a3);
		
	}

}









/* Stack and Heap memory;
1. IN stack memory - Last in first out
2. Main method variales and variable data will be stored in stack memory
3. Method or local variable will be stored in another stack memory. 
4. calss or Instance variables are stored in Heap memory.
5. object or reference variable declared in inside of the main method. where new object will becreated inside the heap memory
  a. after object created in heap memory, It contins all the instance variables and methods be stored in heap.
  b. storing sum data will have the address of the heap memory, that address will be stored in object or reference variabel in stack memory.
   





*/


