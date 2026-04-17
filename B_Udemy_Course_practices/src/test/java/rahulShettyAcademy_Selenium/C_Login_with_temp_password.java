package rahulShettyAcademy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_Login_with_temp_password {
	
	

	public static void main(String[] args) throws InterruptedException {
		String uName ="Rahul";
		
//		WebDriverManager.edgedriver()  .setup();
//		WebDriver driver = new EdgeDriver();
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String mainPassword =getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  
       
//      Signin page
		WebElement username = driver.findElement(By.id("inputUsername"));
		username.sendKeys(uName);
		WebElement password= driver.findElement(By.name("inputPassword"));
		password.sendKeys(mainPassword);
		WebElement signin = driver.findElement(By.className("signInBtn"));
		signin.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(), "Hello "+uName+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(), "You are successfully logged in.");

//      Logout
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Logged out from - " + driver.findElement(By.cssSelector("div[class= 'overlay-panel overlay-right'] h1")).getText());
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
//		without giving any input ,directly click on forgot passwprd
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
//		In forgot page without any input data click on reset password option to display temp password.
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();

//		Please use temporary password 'rahulshettyacademy' to Login.
//      --> Extracting and storing above text in a string "passwrd".
        String passwrdtxt= driver.findElement(By.xpath("//p[contains(@class,'infoMsg')]")).getText();
        System.out.println(passwrdtxt);
		
//	    Split the stored string by single quotes" ' ". Splitted text is stored in String array [].
		String [] splitpswrd =passwrdtxt.split("'"); 
		
//		That text became 2 parts or 2 String arrays
//		index [o]= Please use temporary password '
//		index[1]= rahulshettyacademy' to Login.
//		Rahul Shetty(password) is in index [1]. So, splitting index[1] to extract only Rahul Shetty using same single quote "'".
		String[]  splitpswrd2 = splitpswrd[1].split("'");
	    String mainPasword = splitpswrd2[0];
	    System.out.println("Extracted password is:" + mainPasword);
	    return mainPasword;
	    

		
	}
	

}
