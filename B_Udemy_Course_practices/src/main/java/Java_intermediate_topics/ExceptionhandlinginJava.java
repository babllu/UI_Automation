package Java_intermediate_topics;

public class ExceptionhandlinginJava {

	public static void main(String[] args) {
		trycatchblock();
		// TODO Auto-generated method stub
//		Exception is a event that occurs while execution of the program that disruots the normal flow of instructions.
//		1. Check Exception (complie time exception)--throws keyword
//  	2. Unchecked Exception (runtime exception)--throw keyword

/*    Exception output line called as "Stacktrace": 
 *      Exception in thread "main" java.lang.ArithmeticException: / by zero
		at AutomationAssignments.ExceptionhandlinginJava.main(ExceptionhandlinginJava.java:21)
		~ Contain	Exception name
			Exception Mesaage
			which line number
			Methods Info
	*/
	}
		public static void normalexec() {
		int a = 9;
		int b = 0;
		int results;
		
		results= a/b;
		System.out.println(results);
	}

		public static void trycatchblock() {
			int a = 9;
			int b = 0;
			int results = 0;
			try { // Checks if any exception throws the execution (tryblock)
			results= a/b;
			}
			catch(ArithmeticException ae) {/*Catch will catch the exception throws by try block statement.
				                            and store that exception in "ae" varible and prints that exception in console outpu.*/
				                            //If no exception occures while execution catch block statment will not run.
				System.out.println(ae.toString());// prints type of exceptiona nd exception messgae
				System.out.println(ae.getMessage());// prints only exception message
				ae.printStackTrace();//prints full exception details in console: line, message 
				throw ae; // throw keyword is used if we want to stop execution by java itself after using try catch block. if the exception if critical or something
				
			} 
			/*finally{ // finally the sattemnet run no use 
				System.out.println("finally block");
			}*/
				
			System.out.println("Results:" + results);
			
		}
}
