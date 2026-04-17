package B_Oops_concepts;

public class Arrays {
	
	
	// declaring array variable
	
	int value []= new int [3];
	// method 1
	//Assonging values 
   public Arrays() {
	   value[0] = 12;
	   value[1] = 34;
	   value[2] = 58;
   }
   public void displayvalues() {
	   for(int temp : value) {
		   
		   System.out.println(temp);
	   }
   }
   
   //Method 2 
   
   int[] assignvalues = {12,23,44,74};
   
   public void assignvalues() {
	   for (int tempvalues: assignvalues) {
		   System.out.println(tempvalues);
	   }
   }
   
   //Method 3
   
   int [] assignvaluesnew = new int [] {12,32,43,54,55};
   
   public void displayassignvaluesnew() {
	   
	   for (int newtemp: assignvaluesnew){
		   System.out.println(newtemp);
	   }
   }
   
   public  static void main(String[] args) {
	  //new classname().methodname();
	   
	  new Arrays(). displayassignvaluesnew();
	//new Arrays().assignvalues ();
	//new Arrays().displayvalues();
	   
   }
   
}
