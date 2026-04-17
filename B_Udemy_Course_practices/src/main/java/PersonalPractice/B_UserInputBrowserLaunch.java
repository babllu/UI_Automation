package PersonalPractice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class B_UserInputBrowserLaunch {

	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Browser Name");  
        String browser = Sc.nextLine();
         if(browser.equals("Chrome")) {
        	 System.setProperty("WebDriver.chromeDriver","browser");
 //        }else if(System.setProperty(browser, browser)
         }
        	 
        	 
         
	
	}

}
