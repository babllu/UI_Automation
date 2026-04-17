package B_Oops_concepts;

interface car2 {
	int age= 23;
	String name= "Abhishek";

	void music();//abstract methods and on body only the method signature.
	void longdrive();
}

class luxarycar implements car2 {

	public void music() {
		System.out.println("Listening music in car, that feels owesome");

	}

	public void longdrive() {
		System.out.println("Travelling to long distances makes mind peacefull");

	}

}

public class O_interfcaes {
	public static void main(String[] args) {
		car2 obj;
		obj = new luxarycar();
		obj.music();
		obj.longdrive();
		
		System.out.println(car2.name);
	}

}
