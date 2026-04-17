package TDSS.TandD_Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class JSE_Example {

	public void main() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement drop = driver.findElement(By.xpath("//div[@class=\"css-19bb58m\"]"));
		jse.executeScript("arguments[0].scrollIntoView(true)", drop);
		Thread.sleep(3000);
		//jse.executeScript("arguments[0].click();", drop);
		drop.click();
		
		WebElement ncrOption = driver.findElement(By.xpath("//*[@id='react-select-3-option-0']"));
		jse.executeScript("arguments[0].click();", ncrOption);
		
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		jse.executeScript("arguments[0].scrollIntoView(true)", firstName);
		jse.executeScript("arguments[0].value = 'Abhishek';", firstName);

		jse.executeScript("window.scrollTo(0,100);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,0);");
		
		String pageTitle = (String) jse.executeScript("return document.title;");
		System.out.println("PageTitle: "+pageTitle);
 
		driver.quit();
		
		
	}
}
