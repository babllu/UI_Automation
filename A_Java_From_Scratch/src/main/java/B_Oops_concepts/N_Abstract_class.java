package B_Oops_concepts;

abstract class A {

	public abstract void music();
	public abstract void driving();

}

abstract class car extends A {

	@Override
	public void music() {
		System.out.println("While driving we played music");
	}
	
//	This method is undeclared in the abstract clas, but we can use this normal method in abstract class
	public void dragrace() {
		System.out.println("While a heading to texas we found friend .w ehad a drag race");
	}
}

class gokarting extends car {
	public void driving() {
		System.out.println("I'm driving BMW");
	}
	
	

}

public class N_Abstract_class {
	public static void main(String[] args) {

		gokarting dri = new gokarting();
		dri.music();
		dri.driving();
		dri.dragrace();

	}

}
