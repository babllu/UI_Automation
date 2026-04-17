package TDSS.TandD_Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

/**
 * Hello world!
 */



public class App {
	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
	}

}
