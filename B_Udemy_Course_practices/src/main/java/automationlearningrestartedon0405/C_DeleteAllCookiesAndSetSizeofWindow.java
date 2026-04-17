package automationlearningrestartedon0405;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_DeleteAllCookiesAndSetSizeofWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();

	}

}
