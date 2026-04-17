package webpractices_rahulshettyacademy.com;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_Broken_Links {
	
	public static void main (String [] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		
		for (WebElement links : allElements) {
			 String urllinks = links.getAttribute("href");
			 
			 if(urllinks !=null && !urllinks.isEmpty()) {
				 try {
				 
				 HttpURLConnection connection =(HttpURLConnection) new URL(urllinks).openConnection();
				 connection.setRequestMethod("HEAD");
				 connection.connect();
				 
				 int responseCode = connection.getResponseCode();
				 if(responseCode >=400) {
					 System.out.println(urllinks+ links.getText()+ " --------------------link is bad" + responseCode);
				 } else{
					 System.out.println(urllinks + links.getText() + " --------------------link is good" + responseCode);
				 }
				 }
					 catch(Exception e) {
						 System.out.println(urllinks + "------------------is broken link");
					 }
			 }
				 else {
						 System.out.println(urllinks + "-----------------working good");
				
		System.out.println(urllinks.length());
	     }
	   }
	}

}
