package rahulShettyAcademy_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class O_ScrollintoElements_and_DataTypeConverts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions ac = new Actions(driver);
		
		
		WebElement ee = driver.findElement(By.cssSelector("div.totalAmount"));
		ac.scrollToElement(ee).perform();
		
//		ee.sendKeys(Keys.PAGE_DOWN);
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, 600)");
//		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		
		
		WebElement we = driver.findElement(By.cssSelector(".tableFixHead"));
//		js.executeScript("document.queryselector('.tableFixHead').scrollTop =5000");
//		we.sendKeys(Keys.PAGE_DOWN);
		
		ac.scrollToElement(we).perform();
		
		driver.findElements(By.xpath("//tr/td[4]"));
		

		
		ac.moveToElement(ee).click().keyDown(Keys.SHIFT).sendKeys("abhishek").perform();
		
		
		
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 links.size(); 
		
		
		
		

	}

}
