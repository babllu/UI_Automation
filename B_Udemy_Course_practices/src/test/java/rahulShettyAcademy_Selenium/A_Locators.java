package rahulShettyAcademy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

//      Signin page
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulsheety");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		
//		forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder ='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder ='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9864353253");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(@class,'infoMsg')]")).getText());
		
//		go to login page to login again using temporary password
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
		System.out.println(driver.findElement(By.cssSelector("div p")).getText());
		
//		Logout
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class= 'overlay-panel overlay-right'] h1")).getText());
		
		
		
		
		
		
			
		

	}

}
