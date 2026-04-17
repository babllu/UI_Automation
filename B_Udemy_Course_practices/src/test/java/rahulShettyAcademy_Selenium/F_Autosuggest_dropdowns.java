package rahulShettyAcademy_Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_Autosuggest_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
	        WebDriver driver =  new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       
	        driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ar");
	        
//	        from auto suggest drop down . select the required option from drop down list using ehanced for loop 
	        
	        Thread.sleep(2000);
	        
//	        Store the options in list 
	        List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	        
//	        Using enhanced for loop to select the required option from dd list using equalsIgnoreCase method.
			for(WebElement option: options) {
				
				if(option.getText().equalsIgnoreCase("Armenia")) 
				{	
				  option.click();
					break;
				}
				
			}
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.cssSelector("input[id='autosuggest']")).getText());
//			driver.close();
			
	}

}
