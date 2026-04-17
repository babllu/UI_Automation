package TDSS.TandD_Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Select_Dropdown {

	WebDriver driver;

	public void main() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		WebElement sDropdown = driver.findElement(By.id("state"));
		Assert.assertTrue(sDropdown.isDisplayed());

		Select s = new Select(sDropdown);
		s.selectByValue("Uttar Pradesh");
		s.selectByVisibleText("Uttar Pradesh");
		s.selectByIndex(4);

		List<WebElement> slected = s.getAllSelectedOptions();
		for (WebElement selectedValues : slected) {

			System.out.println(selectedValues.getText());

		}

	}

}
