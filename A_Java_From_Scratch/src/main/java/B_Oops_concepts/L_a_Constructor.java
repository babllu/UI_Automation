package B_Oops_concepts;
class  Dog {
	
	String name ;
	String colour;
	int age ;
	
	public Dog() {
		//this("Rottweler","bloack",2);
		super();
		this.name= "rotweler";
	}
	 public Dog (String name, String colour, int age) {
		 super();
		 this.name = name ;
		 this.colour = colour;
		 this.age = age ;
		 
	 }
}
public class L_a_Constructor {
	
	public static  void main(String [] args) {
		
		Dog d1 = new Dog();
		System.out.println(d1.name);
		
		
		Dog d2 =new Dog("Laborator", "golden", 4);
		System.out.println(d2.age);
		
	}

}
