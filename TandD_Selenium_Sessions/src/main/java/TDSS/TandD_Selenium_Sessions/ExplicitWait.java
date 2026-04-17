package TDSS.TandD_Selenium_Sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriver driver;

	public static void implicitWait() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement name = driver.findElement(By.xpath("//input[@name = 'name']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement logN = driver.findElement(By.xpath("//button[@type='submit']"));

		name.sendKeys("Admin");
		pwd.sendKeys("admin123");
		logN.click();

	}

	public static void explicitWait() {
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement name = driver.findElement(By.xpath("//input[@name = 'name']"));
		WebElement pwd= driver.findElement(By.xpath("//input[@type='password']"));
		WebElement logN =driver.findElement(By.xpath("//button[@type='submit']"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		name.sendKeys("Admin");
		pwd.sendKeys("admin123");
		logN.click();
		

	}

	public static void main(String[] args) {
		implicitWait();

	}

}
