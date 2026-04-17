package suace_labs_project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suacelabs_web {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.cssSelector("img[src='/images/logo.svg']")).isDisplayed();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String mainwindow =driver.getWindowHandle();
		System.out.println(mainwindow);
		Set<String> windows = driver.getWindowHandles();
		for (String s: windows) {
			 if(!s.equals(mainwindow)) {
				 
				driver.switchTo().window(s);
				Thread.sleep(2000);
			 }
		}
		
	    driver.findElement(By.linkText("Try for free")).click();
	    
	    driver.findElement(By.id("signUpWithEmail")).click();
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("heppy@yopmail.com");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Heppy");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Heppy@124");
	    driver.findElement(By.xpath("//input[@id='subscription']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println(driver.findElement(By.className("Hint_hint-text__T7C_I")).getText());
	    driver.findElement(By.className("DataCenter_switch-dc__UQvyC")).click();
	    
	    
	}

}
