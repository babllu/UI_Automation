package Assignments_RahulshettyAcademy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_WindowsHandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		String parentwind = it.next();
		String childwind = it.next();
		
		
		driver.switchTo().window(childwind);
	   System.out.println(driver.findElement(By.tagName("h3")).getText());
	   
	   driver.switchTo().window(parentwind);
	   System.out.println(driver.findElement(By.tagName("h3")).getText());
	   
		
		
		
		
		

	}

}
