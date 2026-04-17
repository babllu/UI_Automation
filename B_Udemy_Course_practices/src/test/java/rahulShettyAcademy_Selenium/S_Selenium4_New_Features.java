package rahulShettyAcademy_Selenium;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_Selenium4_New_Features {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
	        WebDriver driver=new ChromeDriver();

	        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	        
//	        New Blank Window/Tab can be opend 
	        driver.switchTo().newWindow(WindowType.TAB);
	        
	        Set<String> windows =driver.getWindowHandles();
	         Iterator<String> it = windows.iterator();
	         String parentwind = it.next();
	         String childwind = it.next();
	         
	         driver.switchTo().window(parentwind);
	         
//	        Relative locators 
	       WebElement ele =  driver.findElement(By.id("search-field"));
	       System.out.println(driver.findElement(with(By.tagName("label")).below(ele)).getText());

	}

}
