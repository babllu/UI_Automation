package C_Inheritance;

public class A_Mainclass {
	
	public static void main (String args[]) {
		
		
		//creating refernce object of base class
		D_Childclass bc= new D_Childclass();
		int a= bc.multiply(4, 3);
		int b= bc.divi(3, 3);
		int c= bc.add(32, 12);
		int d= bc.sub(43, 98);
		double e = bc.power(3, 3);
		
	
		
		System.out.println("Multipy  of n1 *n2  = " + a);
		System.out.println("division of n1 / n2 = " + b); 
		System.out.println("Addition of n1 + n2 = " + c);
		System.out.println("Subtra   of n2 - n1 = " + d);
		System.out.println("power of n1 & n2    = " + e);
		
	}
}

/* here I hav e2 different class, i wnat to call methods of the both classes in this main class.2 options 
  1. Creating reference object for both the classes.
  2. Inheriting the class A into clas B, then object has been created for the Class B which is inherited class A.*/
  //Childclass inherited parentclass is single inhertance.
