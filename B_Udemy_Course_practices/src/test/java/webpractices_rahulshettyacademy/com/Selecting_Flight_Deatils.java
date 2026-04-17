package webpractices_rahulshettyacademy.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Flight_Deatils {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

        driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ar");
        List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
      
		for(WebElement option: options) {
			
			if(option.getText().equalsIgnoreCase("Armenia")) 
			{	
			  option.click();
				break;
			}
			
		}
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("input[id='autosuggest']")).getText());
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(2000);
		
		WebElement fromCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromCity.click();
		 driver.findElement(By.xpath("//a[@value ='HYD']")).click();
			
		WebElement toCity = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		toCity.click();
		driver.findElement(By.xpath("//a[@value ='GOI']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-datepicker-triger"))).click();
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-state-default.ui-state-highlight"))).click();
				
//		wait.until(ExpectedConditions.elementToBeClickable(By.name("ctl00$mainContent$view_date2"))).click();
//		
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[7]")).click();
//		
        WebElement checkbox=  driver.findElement(By.name("ctl00$mainContent$chk_IndArm"));
        checkbox.click();
        checkbox.isSelected();
	        
		
//      Currency
		WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticDropdown = new Select(selectDropdown);
		staticDropdown.selectByIndex(1);
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByIndex(3);
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByIndex(2);
		System.out.println(staticDropdown.getAllSelectedOptions().getFirst().getText());
		
//		No.of passengers(no.of Adults, childs, infants
		driver.findElement(By.id("divpaxinfo")).click();//---dropdown expansion
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();
		for (int i = 2; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("hrefIncChd")).click();
		int i = 1;
		while (i < 3) {
			driver.findElement(By.id("hrefIncChd")).click();
			++i;
		}
		driver.findElement(By.id("hrefIncInf")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();//---dropdown close
		
		System.out.println("Successfully selected : "+ driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		driver.close();
		
		
	}

}
