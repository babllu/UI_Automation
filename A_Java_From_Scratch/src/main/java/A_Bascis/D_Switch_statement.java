package A_Bascis;

public class D_Switch_statement {

	public static void main(String args[]) {

// Using if and else condition: To print the out put value based on the given value.

		/*
		 * int numb = 3;
		 * 
		 * if (numb == 1) System.out.println("Monday"); else if (numb == 2)
		 * System.out.println("Tuesday"); else if (numb == 3)
		 * System.out.println("Wednessday"); else if (numb == 4)
		 * System.out.println("Thrusday"); else if (numb == 5)
		 * System.out.println("Friday"); else if (numb == 6)
		 * System.out.println("Saturday"); else if (numb == 7)
		 * System.out.println("Sunday"); else
		 * System.out.println("Invalid input");
		 */
// Using switch statement:
/*--In switch statement, If the given value is not matching it will  execute default case.
  --Once the given value is matching with any case,it will execute that block of code (Statment) 
      and also the remaining cases which present in switch case.
  --Break keyword: To avoid/stop the execution of remianing/unwnated cases, once case is matched in the switch statement 
      OR to call out of the switch statment once one of the case is matched
  --Default case: If none of the cases are matching, it will go with default case and print the default statement*/

		
/*		  int num = 6; 
		  switch (num){
		  
		   case 1:
			  System.out.println("Monday"); 
			  break;
		   case 2:
			  System.out.println("Tuesday"); 
			  break;
		   case 3: 
		      System.out.println("Wednessday");
		      break;
		   case 4: 
		      System.out.println("Thrusday"); 
		      break;
		   case 5:  
		      System.out.println("Friday"); 
		      break;
		   case 6:
		      System.out.println("Saturday"); 
		      break;
		   case 7: 
		      System.out.println("Sunday"); 
		      break;
		   case 8:  
		      System.out.println("Invalid input");
		      break;
		   default:
			   System.out.println("Pls enter valid input");
			 
		  }*/
		  
/*--In Java 12 version- New updated has made.
 *     1.We  can use string in switch statement.
 *     2.Earlier the replacement of break keyword is yield keyword. Latert it is changed to >(arrow symbol).*/	
		  
		  String a="Monday";
//	AS many ways we can use switch statement:
//		1.Using >(Arrow) keyword:
		  switch (a)
		  {
			  case "Monday","Tuesday","Wednesday" ->System.out.println("09 AM"); 
							  
			  case "Thrusday","friday"-> System.out.println("10 AM");
			  
			  default -> System.out.println("11 AM");
				  
		  }// No furthur case are executing.
		  
//		  2.Using Switch as an Expression: First create new variable and give initail value as null.
//		      To assigning a value to variable and calling that varibale, instead of directly printing.
		  String b = "friday";
		  String results ;
		  
		  switch(b){
			  case "Monday","Tuesday","Wednesday" ->results ="09 AM"; 
			  
			  case "Thrusday","friday"-> results="10 AM";
			  
			  default -> results="11 AM";
			  
		  }
		  System.out.println(results);
		  
		  
//		  3. Switch to return a Value.
		  	
		  String c = "sat";
		  String results_1 ;
		  
		  results = switch(c){  // Asking switch(Expression) to return the output (results)
			  case "Monday","Tuesday","Wednesday" -> "09 AM"; 
			  
			  case "Thrusday","friday"-> "10 AM";
			  
			  default -> "11 AM";
			  
		  };
		  System.out.println(results);
		  
//		  Using yield keyword	
		  
		  String d = "Thrusday";
		  String results_2 ;
		  
		  results = switch(d){  // Asking switch(Expression) to return the output (results)
			  case "Monday","Tuesday","Wednesday" :yield "09 AM"; 
			  
			  case "Thrusday","friday":yield "10 AM";
			  
			  default :yield "11 AM";
			  
		  };
		  System.out.println(results);
		  
	}
}
