package A_Bascis;

public class B_if_Else_if_Conditions {

	public static void main(String[] arg) {

		// If Condition; Prints the results only if the condition is Only true.
		/*
		 * int a=9; int b=10;
		 * 
		 * if (a<b) System.out.println("true");
		 */

		// If else -Condition; Check the condition and prints the correct
		// statement
		int x = 23;
		int y = 21;

		if (x > y)
			System.out.println(x);
		else
			System.out.println(y);
		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd Number");
		}

		// else_if condition, Finding greater one from 3 value;
		int a = 12;
		int b = 11;
		int c = 33;

		if (a > b && a > c) {
			System.out.println("a");
		} else if (b > a && b > c) {
			System.out.println("b");
		} else {
			System.out.println("c");

		}
	}
}
