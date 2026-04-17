package B_Oops_concepts;

class StaticMethod { // Created static variables
	static String brand = "Apple"; // Declaring and assigning value to static variable
	static String model = "16 pro";
	static int price = 1200;
	static String mobileType = "Smart Phone";

	static void printingOutput() { // Static method will access only static variables.
		System.out.println("Mobile Type = " + mobileType + " Where Brand & price : "
						+ brand + " " + model + " =  $ " + price);
	}	
}


/* How to call or print non static variables with static method: By Indirect method  
   --- Create object of class 
   --- Call the static method using class name and passing the class object.
   --- and same thing in static method, pass the the class name with obj and refere theobj to the variable in static method.
   Basically we cannot call the non static variable in static method  */
class Carpurchase{
	String company;
	String model;
	int price ;
	
	// Accepting the class oject and refering that obj to the variables
	static void cardetailsprinting(Carpurchase car2) {  
		System.out.println("Car Brand  = "+ car2.company );
		System.out.println("Model      = "+ car2.model);
		System.out.println("Car Price  = "+car2.price);
	}
}
public class J_Static_method {

	public void main(String[] args) {

		StaticMethod.printingOutput();     // Calling static method using class name.
		
		Carpurchase car1 = new Carpurchase();//Creating object of Carpurchase class
		car1.company = "Volkswagen";    //Declaring variables
		car1. model ="Polo TDI";
		car1.price = 12500;
		
		Carpurchase car2 = new Carpurchase();
		car2.company = "Honda";
		car2. model ="Elvate";
		car2.price = 14500;
		
		
		Carpurchase.cardetailsprinting(car1); //Calling static method by passing object(car1) of carpurchase class.
		
	}

}
