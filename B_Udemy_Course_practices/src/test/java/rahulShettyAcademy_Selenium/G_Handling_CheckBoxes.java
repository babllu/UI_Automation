package rahulShettyAcademy_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_Handling_CheckBoxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement checkbox = driver
				.findElement(By.name("ctl00$mainContent$chk_IndArm"));
		checkbox.click();
		checkbox.isSelected();

		
//		Assignment -1
		
		driver.navigate()
				.to("https://rahulshettyacademy.com/AutomationPractice/#top");
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));

		checkBox.click();

		System.out.println(checkBox.isSelected());

		checkBox.click();

		System.out.println(checkBox.isSelected());
		
//		Assignment 1.1

		WebElement ele = driver.findElement(By.id("checkbox-example"));
		System.out.println(ele.getSize());

		List<WebElement> check = driver
				.findElements(By.xpath("//input[@value='checkbox']"));

		System.out.println(check.size());
		
		
//		Assignment-2
		
		driver.navigate().to("https://rahulshettyacademy.com/angularpractise");

	}

}
