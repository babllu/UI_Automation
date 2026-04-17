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

public class T_openMultiple_Links_in_NewWindow {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
	        WebDriver driver=new ChromeDriver();

	        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	   
	          driver.findElement(By.tagName("a")).getSize();
	        
	       
	}

}
