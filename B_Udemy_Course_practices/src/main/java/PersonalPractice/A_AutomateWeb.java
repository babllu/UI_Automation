package PersonalPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_AutomateWeb {
 public static void main (String [] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.easemytrip.com/flights.html");
	  
	  driver.close();
	  
	  
 }
}
