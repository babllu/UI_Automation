package E_practical_use_of_super_this_keywords;


class Employee {

	// instance varibles
	int ID;
	String name, dep;
	float sal;

// creating constructor
   public Employee(int ID, String name, String dep) { // Acces Specifiers can be used in constructor
	   this.ID =ID; // this key will refer constructor & initilazes instance varible
	   this.name= name;
	   this.dep =dep;
	   
   }
   
   Employee (int ID, String name, String dep, float sal){
	   this(ID,name,dep); //reusing constructor
	   this.sal= sal;
	   
   }
   
   public void display() {
	    System.out.println(ID +" "+ name+" "+dep);
   }
   
}
 class ThisKeyWordExample {
	
	public static  void main (String [] args) {
		
		Employee Em1= new Employee(33, "lilly", "QA");
		Employee Em2= new Employee(34, "Ill", "AIA", 34000);
		
		Em1.display();
		Em2.display();
		
	}


}