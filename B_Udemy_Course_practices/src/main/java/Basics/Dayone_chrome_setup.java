package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dayone_chrome_setup {
	
	public static void main (String[] args) {
		
//		System.out.println("Hi Abhishek");
		
//Driver setup
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//	WebPage Login
	driver.get("https://www.demoblaze.com/");
	
//	SignUp
	driver.findElement(By.id("signin2")).click();
    driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("Boloou");
 	driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("Boluu@123232!");
//  driver.findElement(By.tagName("button")).click();
//  driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
	
}
}
