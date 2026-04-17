package B_Oops_concepts;
class Animal {

	String name;
	String colour;
	int age;

	public Animal() {        ///NO arguments (Default constructor
		name = "Tiger";
		colour = "Golden colour";
		age = 3;
		
		System.out.println("Animal name = " + name.toUpperCase() +" & colour : "+ colour.toUpperCase());
	}
	public Animal(String name, String colur, int age) {//Parameterized constructor (with arguments)

		this.name = name; // Using this keyword due to the instance and local variables are having same name 
		this.colour = colur;
		this.age = age;
		System.out.println("Animal name = " + name.toUpperCase() +" & colour : "+ colour.toUpperCase() );
	}

}
public class L_Constructor {

	public static void main(String[] args) {
		Animal a1 = new Animal();
//		System.out.println(a1.name);

		Animal a2 = new Animal("Kangaroo", "black", 3);
//		System.out.println(a2.colour);

	}

}
