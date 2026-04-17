package rahulShettyAcademy_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K_Windows_Handles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
//		New tab will open (New tab or Window wil be cnsidered as new Window in Selenium).
//		To get the window Id's and store it (set is used to stores window handles)
		
		 Set<String> windows=driver.getWindowHandles();
		 
//		 Iterator is used to iterate the windows.
		 
		 Iterator<String> it = windows.iterator();
		 String parent_Id = it.next();
		 String childId = it.next();
		 System.out.println(it.hasNext());
		 
		 driver.switchTo().window(childId);
		 
		 String usrnam = driver.findElement(By.cssSelector("p.im-para.red")).getText();
		 System.out.println(usrnam);                 
		 String fname = usrnam.split("at")[1].trim().split(" ")[0].trim();
		 System.out.println(fname);		
		 
		 driver.switchTo().window(parent_Id);
		 WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		 userName.sendKeys(fname);
		 
		
	}

}
