package rahulShettyAcademy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H_Explicit_WebDriver_wait {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
			WebElement usertype = driver.findElement(By.xpath("//span[text()=' User']"));
			usertype.click();
			usertype.isSelected();
			
//			WebDriver wait (Explicit wait)
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn']")));
			System.out.println("Alert received for selecting ''user'' as user type:" + driver.findElement(By.className("modal-body")).getText());
			driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
			
			Select optns = new Select(driver.findElement(By.cssSelector("select.form-control")));
			// optns.selectByIndex(1);
			optns.selectByValue("teach");
			System.out.println("Selected role:" + optns.getFirstSelectedOption().getText());
			driver.findElement(By.cssSelector("input[id='terms']")).click();
			driver.findElement(By.cssSelector("input[id='signInBtn")).click();
			
			driver.close();
		}

}
