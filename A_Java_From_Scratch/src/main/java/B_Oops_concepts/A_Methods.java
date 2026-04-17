package B_Oops_concepts;


public class A_Methods{ // class created
	
	public void spotify() { // method created without any return type (void -no return type)
		
		System.out.println("Music will be played....");
		
	}
	
	public String call(int recharge) { //String as return type in method2
		
		return "Recharged";
	}
	
	
	public String storage (int rom) {// String as return type 
		if (rom < 256) {
		return "low storage";
	}else {
		
		return ("Enough storage");
	}
}



	public static void main(String[] args) {
		A_Methods m =new A_Methods(); // obj or instance created for A_Method class
		      
		  m.spotify(); // call void typr method using refrence variabe of A_Method class
		
		String str1 =m.call(7);  // To call a method (Assigning method t Return data type with variable name ) 
		                        //should create and assign reference variable to return data type to call a method and then prnt that varaible.
		   System.out.println(str1);
		
		String sr= m.storage(156); // To call a return type 
				                  //should create and assign reference variable to return data type to call a method and then prnt that varaible.
		   System.out.println(sr);
		
	}
}


















