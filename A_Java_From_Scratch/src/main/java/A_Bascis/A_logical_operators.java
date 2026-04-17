package A_Bascis;

public class A_logical_operators {

	public static void main(String[] args) { // logical operatores are &-And,
												// ||-OR, ! -NOT
		int a = 12;
		int b = 11;
		int c = 12;
		int d = 11;

		/*&&- AND operator; Results will be true, only if both the condition
		 * are true. if any one of the condition is false, results will be
		 * failed
		 */

		// Boolean results = a <= b && b<=c; // False -- one the condition is
		// false.
		// Boolean results = a >b && b<c; // True - both the conditions are true
		// Boolean results = d>c && d >a; // False -- both the conditions are
		// false.

		/*
		 * ||- OR Operator; If any one condition is true, result swill be true and same results, if both are true.
		 * If both the conditions are false , results will be false
		 */
//		   Boolean results = a> b || c>d; // True -- Both condition are true.
//		   Boolean results = a<b || c>d;    // True-- One ofbthe condition is true 
//         Boolean results = a<b || c<d;   // False -- both the conditions are false.
		
		
/*        ! - NOOT operator; If the both the condition are true, resulta will be false.
 *         If the both the conditions are false, results will be True.
 */
//         Boolean results = a>b ; // Actually condition is true, But the reesulta are false.
		  Boolean results = a<b && b>c;  //Results are True --but the  Condition are false
		System.out.println(!results);

	}

}
