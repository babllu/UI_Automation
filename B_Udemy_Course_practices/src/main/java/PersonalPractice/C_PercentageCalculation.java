package PersonalPractice;

import java.util.Scanner;

public class C_PercentageCalculation {
//  Calculate the percentage of 5 subjects marks of a student 
	  
	static Scanner scan= new Scanner(System.in);
	
	
	public void percentagecalc() {
		  System.out.println("Enter the all 5 subject marks");
		  int totalmarks = 500;
		  
		  int sub1 = scan.nextInt(); 
		  int sub2 = scan.nextInt();
		  int sub3 = scan.nextInt(); 
		  int sub4 = scan.nextInt(); 
		  int sub5 = scan.nextInt(); 
		  int tmarks = (sub1 + sub2 + sub3 + sub4 + sub5);
		  System.out.println("Total marks =" + tmarks);
		  float percentage =((tmarks*100)/500); 
		  System.out.println("Total percentage=" + percentage);
		  return;
	}
	
//		Greeting to Random name: 
		 public  void greeting() { 
		 System.out.print("Enter Name");
		 String name = scan.next();
		 
		  for (int i=9; i>=10 ; i++) {
			  System.out.println("Hello  "+( name) +", Have a good day");
		  }
		 
	}
		 
		 public   void givenInputIntegerOrNot() {
			 
			 System.out.println("Enter number :" );
			 try {
				 int num = scan.nextInt();	 
				System.out.println("The number u have entered is integer");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("the enter number is not Integer");
	}
}
		 public void lowerCaseConvert() {
			 String name = "Abhishek";
			 name.toLowerCase();
			 System.out.println(name.toLowerCase());
		 
	}	 
		 public void passOrFail() {
			 
			  System.out.println("Please Enter marks of All 3 Subjects:");
			  int sub1 = scan.nextInt();
			  int sub2 = scan.nextInt();
			  int sub3 = scan.nextInt();
			  int tmarks = 300;
			  int total = (sub1 + sub2 +sub3);
			  double per = (total*100)/tmarks;
			   System.out.println("Total 3 subjects percentage is:"+ per);
			   
			   if (per >= 40 && sub1 <33 && sub2 <33 && sub3 <33) {
				   System.out.println("The student is pass");
			   }else {
				   System.out.println("This student is failed");
			   }
			   
		 }
		 
		 public void DayOfWeek() {
			 
			 System.out.println("Enter the number:");
			 int numb = scan.nextInt();
			 
			 if (numb == 1) {
				 System.out.println("Monday");
			 }else if(numb ==2) {
				 System.out.println("Tuesday");
			 }else if(numb ==3) {
				 System.out.println("Wednessday");
			 }else if(numb ==4) {
				 System.out.println("Thrusday");
			 }else if(numb ==5) {
			     System.out.println("Friday");
			 }else if(numb ==6) {
				 System.out.println("Saturday");
			 }else if(numb ==7) {
				 System.out.println("Sunday");
			 }else {
				 System.out.println("Invalid input");
			 }		
			 scan.close();
			 
		 }
		 
//		 Same Class , different method and different parameters = Method overloading
		 
			 public static void main(String [] args) {
				 C_PercentageCalculation cal= new C_PercentageCalculation();
			 cal.givenInputIntegerOrNot();
//			 greeting();
//			 percentagecalc();
//			 lowerCaseConvert();
//			 passOrFail();
//			 DayOfWeek();
			 
				 
//     			 int x = 55;
//				 int y = ++x;
				 
//              char a ='b';
//              char c = ++a;
				 
//				float a =7/4;
//				float b = 9/2;
//				float c = a*b;
//                 System.out.println(c);
				 			 
			 }
			 
			 
			 
		 
}
