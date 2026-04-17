package rahulShettyAcademy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B_Retriving_forgotten_Password {
	public static void main(String[] args) throws InterruptedException {
		String uName ="Rahul";
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver()  .setup();
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  
       
//      Signin page
		WebElement username = driver.findElement(By.id("inputUsername"));
		username.sendKeys(uName);
		WebElement password= driver.findElement(By.name("inputPassword"));
		password.sendKeys("rahulshety");
		WebElement signin = driver.findElement(By.className("signInBtn"));
		signin.click();
		System.out.println("System:" + driver.findElement(By.cssSelector(".error")).getText());

//      forgot password
		WebElement forgotoption = driver.findElement(By.linkText("Forgot your password?"));
		forgotoption.click();
		driver.findElement(By.xpath("//input[@placeholder ='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder ='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9864353253");
		WebElement resetoptn = driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]"));
		Thread.sleep(1000);
		resetoptn.click();
		
//      Retriving password 
		
       //	    Please use temporary password 'rahulshettyacademy' to Login.
       /*       Extracting the password related text fromm forgot page, because it is temporary pass , 
		        it will change  more frequently.
		        store the temporary password text in a string object ("passwrd").*/
		String passwrd= driver.findElement(By.xpath("//p[contains(@class,'infoMsg')]")).getText();
	    System.out.println(passwrd);
			
        //		Split the stored string by single quotes" ' ". Splitted text is stored in String array [].
		String [] splitpswrd =passwrd.split("'"); 
			
			
        //		That text became 2 parts or 2 String arrays
        //	   	index [o]= Please use temporary password '
        //		index[1]= rahulshettyacademy' to Login.	
        //		rahulshettyacademy (password) is in index [1]. 
        //		So, splitting index[1] to extract only rahulshettyacademy(password) using same single quote "'".
		String[]  splitpswrd2 = splitpswrd[1].split("'");
        //		index[0]= rahulshettyacademy
        //		index[1]=  to Login.
        //      stroing "rahulshettyacademy" in mainPassword string object/variable.
		String mainPasswrod = splitpswrd2[0];
        //	    printing password in console 
		System.out.println("Your temporary password is: " + mainPasswrod);
		

        //      go to login page to login again using temporary password.
       //		clicking "go to login" in forgot page to login again with temp password.
		
//      Login again with Temp password
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		username.sendKeys(uName);
	    password.sendKeys(mainPasswrod);
	    Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
        //		verifying page after successfull login
		Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(), "Hello "+uName+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(), "You are successfully logged in.");

//      Logout
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Successfully logged out from " + driver.findElement(By.cssSelector("div[class= 'overlay-panel overlay-right'] h1")).getText());
		driver.close();

	}

}
