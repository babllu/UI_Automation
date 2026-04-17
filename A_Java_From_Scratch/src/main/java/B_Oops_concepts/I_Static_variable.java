package B_Oops_concepts;

class Mobiles { // Instance variables created 
	String brand;
	String model;
	int price;
	static String mobileType = "smart Phone"; 
	

	public void printingOutput() { //method
		
		System.out.println("Mobile Type= "+ mobileType +"   Brand & price : "+ brand +" "+ model +" = "+ price);
	}

}
public class I_Static_variable {
	public static void main(String args[]) {
		Mobiles mb1 = new Mobiles();

		mb1.brand = "Apple";
		mb1.model = "16 pro";
		mb1.price = 120000;
		Mobiles.mobileType=" smart Phone";//Static variables should call with class name.We can call with objects(mb1& mb2), but it is not appropriate way.
		
		
		Mobiles mb2 = new Mobiles ();
		
		mb2.brand ="Samsung";
		mb2.model ="S23 ultra";
		mb2.price = 100000;
		Mobiles.mobileType=" Smart Phone";
		
		
		
	   mb1.printingOutput();
	   mb2.printingOutput();

	   
	   

	}

}
