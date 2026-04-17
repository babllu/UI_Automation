package rahulShettyAcademy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_Dropdown_Practice_page_login {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/practice-project");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		Practice page login
		driver.findElement(By.xpath("//div[contains(@class, 'form-group')]/input[1]")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rahul@yopmail.com");
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
		
/*		Automation projects practice page 
		Automation project-1*/
		driver.findElement(By.linkText("Automation Practise - 1")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='brand greenLogo']")).getText());
		driver.navigate().back();
		
//		Automation project -2
		driver.findElement(By.linkText("Automation Practise - 2")).click();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText());
		
//		driver.close();
	}

}
