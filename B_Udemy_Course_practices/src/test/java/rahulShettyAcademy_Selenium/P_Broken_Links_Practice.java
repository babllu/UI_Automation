package rahulShettyAcademy_Selenium;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_Broken_Links_Practice {
	
	public static void main (String [] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		
		for (int i =0; i<allElements.size();i++) {
		
			try{
				WebElement ele = allElements.get(i);
			String linkUrl = ele.getAttribute("href");
			
			if(linkUrl != null && !linkUrl.isEmpty()) {
				
				if (linkUrl.startsWith("http") || linkUrl.startsWith("https")) {
					
					try {
						URI uri = new URI(linkUrl);
						URL url = uri.toURL();
						         HttpURLConnection con = 
						        		 
						        		 (HttpURLConnection) new URL(linkUrl).openConnection();
						         con.setRequestMethod("HEAD");
						         con.connect();
						         Thread.sleep(2000);
						         
						         int resCode = con.getResponseCode();
						         if (resCode >=400) {
						        	 System.out.println(linkUrl + "is broken link"+ resCode);
						         }else {
						        	 System.out.println(linkUrl + "is valid link" + resCode);
						         }
					}
					catch(Exception ex) {
						System.out.println(linkUrl + "is broken link due to " + ex.getMessage());
						
					}
				}
			}
		}
			catch(Exception e) {
				allElements = driver.findElements(By.tagName("a"));
			}
			
		}
		driver.close();
		
	
 }

}
