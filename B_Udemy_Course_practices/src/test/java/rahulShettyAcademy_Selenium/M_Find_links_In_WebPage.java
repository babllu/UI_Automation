package rahulShettyAcademy_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M_Find_links_In_WebPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//Find total links present in webpage (except the iframe links)
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		find the links present in frame of webpage 
		driver.switchTo().frame("iframe-name");
		System.out.println(driver.findElements(By.tagName("a")).size());
//		to step out from frames
		driver.switchTo().defaultContent();
		
//		find the links present in one part of an webpage, 
//		By limiting webdriver scope to that particular part of webpage
		WebElement footdriver = driver.findElement(By.xpath("//div[contains(@class, 'footer_top_agile_w3ls gffoot footer_style')]"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		WebElement divfoot = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(divfoot.findElements(By.tagName("a")).size());
		
		WebElement divfoot2 = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul"));
		int  links = divfoot2.findElements(By.tagName("a")).size();
		System.out.println(links);

		
		for(int i=1; i<links;i++){
			
			String keys  = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			divfoot.findElements(By.tagName("a")).get(i).sendKeys(keys);
			Thread.sleep(5000);
		}
		Set<String> opendrvrs = driver.getWindowHandles();
		Iterator<String>  allopenwin = opendrvrs.iterator();
		
		while(allopenwin.hasNext()) {
			 driver.switchTo().window(allopenwin.next());
			System.out.println(driver.getTitle());
		}

	}

}
