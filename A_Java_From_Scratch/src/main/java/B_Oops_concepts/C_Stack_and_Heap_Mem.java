package B_Oops_concepts;
  

class Calculator1{
	//Class level objects and variables uses Heap memory
	  int num =5; //Stored in heap memory
	  
	  
	  public int add( int a, int b) {
		// method level uses stack memory.
		  return a+b;  //Stored in stack memory
		  
	  }
	  
  }
public class C_Stack_and_Heap_Mem {

	public static void main(String[] args) {

		int data = 10;
		/* new objects are created in heap memory. The method using reference variable of
		new obj is also stored in new object that created in Heap memo  */
		Calculator1 cal = new Calculator1();
		
		int sum= cal.add(4,6);
		
		System.out.println(sum);       
		
		Calculator1 cal1 = new Calculator1();
		
		
		System.out.println(cal1.num);
		
		

	}

}
