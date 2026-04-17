package B_Oops_concepts;


class Gettersetter{
	
	private String name;
	private int age;
	private String martialstatus;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public String getMartialstatus() {
		return martialstatus;
	}
	public void setMartialstatus(String ms) {
		this.martialstatus = ms;
	}
}
public class K_Encapsulation{

	public static void main(String[] args) {
		Gettersetter gs=new Gettersetter();
		gs.setName("Abhishek");
		gs.setAge(23);
		gs.setMartialstatus("Unmarried");
		
		
//		System.out.println( gs.getName() + "  is  "+ gs.getAge() +" years old and his is " + gs.getMartialstatus());
		
		
		
		

	}

}
