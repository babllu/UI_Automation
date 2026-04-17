package rahulShettyAcademy_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_DD_Practice2_Passenger_Currency {
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
//		Static drop down: Dropdowns with select tag is Static drop down. where options are fixed
		WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));	
		Select ele = new Select(selectDropdown);
		ele.selectByIndex(3);
		System.out.println(ele.getFirstSelectedOption().getText());
		ele.selectByIndex(1);
		System.out.println(ele.getFirstSelectedOption().getText());
		ele.selectByIndex(2);
		System.out.println(ele.getAllSelectedOptions().getFirst().getText());
		
		
//		Dropdown with adding members option
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
	
		WebElement adlts = driver.findElement(By.id("hrefIncAdt"));
		adlts.click();
//		To add adults count using for loop
		for(int i=2;i<5;i++) {//---> loop started from index 2 because 1 default person and 2nd person is selected in line 36.
			adlts.click();
		 }
		
		
//		 add 3 childs  age betweeen 2-12 years 
		 WebElement childs= driver.findElement(By.id("hrefIncChd"));
		 childs.click();
//		 using while to increase the count
		 int i=1;
		 while(i<3) {//---> loop started from index 1 because no default passenger, but 1st child is selected in line 46.
			 childs.click();
			 ++i;
		 }

//		 Add one child below 2 years
		 driver.findElement(By.id("hrefIncInf")).click();
		 
//		 To close the dropdown by selecting "Done" button
		 driver.findElement(By.id("btnclosepaxoption")).click();

//		 printing to check the no of members has slected.
		System.out.println("Successfully selected : " + driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		
	}

}
