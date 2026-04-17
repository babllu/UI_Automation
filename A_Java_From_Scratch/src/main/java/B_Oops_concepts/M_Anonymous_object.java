package B_Oops_concepts;
class Apple {

	String a;

	public void print() {

		System.out.println("Happy Sunday");
	}
}
public class M_Anonymous_object {

	public static void main(String[] args) {
		new Apple().print(); // An object created without any object reference
								// name is called as Anonynmous object. Only
								// once can we this anonymous object.

	}

}
