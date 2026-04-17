package rahulShettyAcademy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_Frames_handling {
	public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

/*		Using webElement  to switch into Top_frame

		WebElement topframe = driver.findElement (By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(topframe);   
		
		
	   Switching to middle frame in the top frmae using WebElement
 
		WebElement middleframe =driver.findElement (By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(middleframe);   */
		
		
		
//		Directly switch into top frame using frame name
		driver.switchTo().frame("frame-top");    
		
//		Directly switch into middle frame in th top frame using frame name
		driver.switchTo().frame("frame-middle");    
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
//		driver.close();
	}

}
