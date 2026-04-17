package B_Oops_concepts;
abstract class Computer {

	public abstract void coding();
}

class Desktop extends Computer {
	public void coding() {

		System.out.println("Java, python, react");

	}
}

class Laptop extends Computer {

	public void coding() {

		System.out.println("Reactjs, .net, etc");
	}
}

class Developer {
	public void coding(Computer desk) { //
		desk.coding();
	}
}
public class P_Interface_depth {

	public static void main(String[] args) {
		Computer desk = new Desktop();
		Laptop Lap = new Laptop();

		Developer dev = new Developer();
		desk.coding();
		System.exit(0);

	}

}
