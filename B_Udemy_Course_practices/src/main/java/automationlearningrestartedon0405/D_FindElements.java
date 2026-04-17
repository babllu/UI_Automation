package automationlearningrestartedon0405;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_FindElements{

// Go To Asactin.com website and give Username and password and login
	public static void login() throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		 WebElement w1 = driver.findElement(By.id("username"));
		 w1.sendKeys("vengtram");
		 
		 WebElement w2= driver.findElement(By.name("password"));
		 w2.sendKeys("vengat@123445");
		 
		 WebElement w3 = driver.findElement(By.id("login"));
		 w3.click();
		 
		 
		 WebElement w4 = driver.findElement(By.linkText("Forgot Password?"));
		 w4.click();
		 
	     driver.close();		 
	}
	 
	
// Go To Asactin.com website and give Username and password and print that username and Password in console
	public static void getGivendata() {
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vengtram"); 
		driver.findElement(By.name("password")).sendKeys("Karthick");
		 
		String s= driver.findElement(By.id("username")).getAttribute("value");
		String s1=driver.findElement(By.name("password")).getAttribute("value");
		
		System.out.println(s);
		System.out.println(s1); 
	
		
	}
	

	
//	Go To Asactin.com website and Check same webpage is opened.
	public static void SameWebPageCheckIn() {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vengtram"); 
		driver.findElement(By.name("password")).sendKeys("Karthick");
		 String s = driver.getCurrentUrl();
		 if (s.equals("https://adactinhotelapp.com/")) {
			 System.out.println(" You are in correct page");
		 }else {
			 System.out.println(" You  are in wrong page");
		 }
	}

	
	
// Check whether loggedd failed error msg displayed or not;
	public static void loginfailedmsg() throws InterruptedException {
	
	WebDriverManager.chromedriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("vengtram"); 
	driver.findElement(By.name("password")).sendKeys("Karthick");
	driver.findElement(By.id("login")).click();
	Thread.sleep(1500);
	String s = driver.getCurrentUrl();
	Boolean bool = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b")).isDisplayed();
	if (bool =true) {
	 System.out.println(" Login failed displayed");
	}else {
	 System.out.println("NO");
	}
 }

	
// Go to google and check whether google logo is displayed or not:
	public static void goooglelogoverfication() {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Boolean boole = driver.findElement(By.id("logo")).isDisplayed();
		 if (boole == true) {
			 System.out.println("google log displayed");
		 }else {
			 System.out.println("Not");
		 }
		 }

	
/* Handling multiple Elements
	we use findElements();
	return type of findelements() is List<WebElement>
	*/
	public static void findalllinksingooglepage() {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 List<WebElement> x= driver.findElements(By.tagName("a"));
		  System.out.println(x.size());
		  
		  for (WebElement x1:x) {
			  System.out.println(x1.getAttribute("href"));
		  }
		 
		
	}
 	
	
	public static void main(String []args) throws InterruptedException {
		//  login();
		//  getGivendata();
		//  SameWebPageCheckIn();
		//  loginfailedmsg();
		//  goooglelogoverfication();
		findalllinksingooglepage();
     
	   }
}
