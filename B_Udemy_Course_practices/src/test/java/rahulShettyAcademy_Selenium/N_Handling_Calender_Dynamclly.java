package rahulShettyAcademy_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class N_Handling_Calender_Dynamclly {

	
	public static void main(String[] args) throws InterruptedException {
		
		String day ="4";
		String month ="10";
		String year ="2005";
		String[] expectedList = {month,day,year};

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		Calendar Icon
		driver.findElement(By.cssSelector("div[class='react-date-picker__inputGroup']")).click();
		
//		click to change month from current month 
	    driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
	    
//	    click to change year from current year 
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText")).click();
		
//		click to change decade from current decade 
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText")).click();
		
//		Select to change decade 2001 to 2010  from current month 
		driver.findElement(By.xpath("//div/button[@class= 'react-calendar__tile react-calendar__century-view__decades__decade']")).click();
		
//	    To Select 2005  from current year list 
		WebElement calendarYear =driver.findElement(By.xpath("//button[text()='"+year+"']"));
		System.out.println(calendarYear.getText());calendarYear.click();
		
//		To Select month  from current month list
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).
		get(Integer.parseInt(month)-1).click();
		
//		To Select 2005  from current year list
		WebElement calendarDay = driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']/abbr[text()='"+day+"']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(calendarDay));
		System.out.println(calendarDay.getText());
		calendarDay.click();
		
		
		List<WebElement> actualdate  = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i =0; i<actualdate.size(); i++) {
		System.out.println(actualdate.get(i).getAttribute("value"));
		Assert.assertEquals(actualdate.get(i).getAttribute("value"), expectedList[i]);
		}
		
//		driver.close();
		
	}
}
