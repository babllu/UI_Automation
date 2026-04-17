package B_Oops_concepts;

public class H_Strings {

	public static void main(String[] args) {
/* Strings are Immutable _ Once string is created it cannnot be chnage.
   Once  string variable is created it is stored in String constant pool in heap memory of JVM
   Where reference variable is stored in stack memory of JVM. variable data will have the address in heap.
   Using that address reference variable will refer the variable data from hepa memory*/
		
		
		
		
   String name = "Abhi";  //Abhi variable created and stored in heap memory with some addresss reference
    name =name+"shek";    //Name + shek-- for shek another variable data is created in heap with different address to name  reference variabl.
     System.out.println(name);

    String s1 ="Guddeti";
    String s2 = "Abhishek";
    
    String s3= s1 + s2;
     System.out.println(s3);
}

}
