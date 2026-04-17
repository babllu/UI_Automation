package rahulShettyAcademy_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J_Actions_Classes {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		
		Actions a= new Actions(driver);  // ACTIONS CLASS
		
//		To Enter text in upper case 
		a.moveToElement(userName).click().keyDown(Keys.SHIFT).sendKeys("rahulshettyacademy").perform();
		
//		To double click on object and right click for more options
		a.moveToElement(userName).doubleClick().contextClick().perform();
		
//		a.moveToElement(driver.findElement(By.cssSelector("input[id='username']"))).doubleClick().contextClick().perform();
		
		a.scrollToElement(userName);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys();
		
		WebElement x = driver.findElement(By.xpath(" "));
		WebElement v = driver.findElement(By.xpath(" "));
		
		a.clickAndHold(x).moveToElement(v).release().perform();
		
			

	}

}
