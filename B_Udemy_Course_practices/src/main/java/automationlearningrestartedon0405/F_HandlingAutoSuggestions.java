package automationlearningrestartedon0405;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_HandlingAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		String Url = "https://www.google.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		
	   driver.findElement(By.name("q")).sendKeys("selenium");
       	

	   String xp ="//span[contains(test(),'selenium')]";
	   List <WebElement> allsuggestions = driver.findElements(By.xpath("xp"));
	   
//    To count  of suggestions
	   int count = allsuggestions.size();
	   System.out.println(count);
	   
//    To print all suggestions
	   
	   for (int i = 0; i< count; i++) {
		   WebElement suggestion = allsuggestions.get(i);
		   String text = suggestion.getText();
		   System.out.println(text);
	  
	   }
		  

	}

}
