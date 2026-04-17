package TDSS.TandD_Selenium_Sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtons {

	WebDriver driver;

	@BeforeMethod
	public void driverStart() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");

	}

	@Test
	public void radiButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		WebElement yesOption = driver.findElement(By.xpath("//input[@value='igottwo']"));
		WebElement yesSelectMsg = driver.findElement(By.xpath("//div[@id='check']"));
		WebElement impressiveOption = driver.findElement(By.xpath("//input[@value='igotthree']"));
		WebElement impressiveSelectMsg = driver.findElement(By.xpath("//div[@id='check1']"));
		WebElement disabledOption = driver.findElement(By.xpath("//input[@value='option3']"));

		/*
		 * if(yesOption.isDisplayed() && impressiveOption.isDisplayed() &&
		 * disabledOption.isDisplayed()) {
		 * 
		 * System.out.println("displayed"); }else { System.out.println("not displayed");
		 * 
		 * }
		 */

		Assert.assertTrue(yesOption.isDisplayed() && impressiveOption.isDisplayed() && disabledOption.isDisplayed());
		/*
		 * if(disabledOption.isEnabled()) { System.err.println("Yes! Enabled"); }else {
		 * 
		 * System.out.println("No!,It is disabled"); }
		 */

		Assert.assertFalse(disabledOption.isEnabled());

		yesOption.click();
		/*
		 * if(yesOption.isSelected()) { System.out.println("Yes! option is selected");
		 * }else { System.out.println("Yes! option is not selected"); }
		 */

		Assert.assertTrue(yesOption.isSelected());
		String selectedMsg = yesSelectMsg.getText();
		Assert.assertEquals(selectedMsg, "You have checked Yes");
		System.out.println(selectedMsg);

		impressiveOption.click();

		/*
		 * if(impressiveOption.isSelected()) {
		 * System.out.println("Impressive! option is selected"); }else {
		 * System.out.println("Impressive! option is not selected"); }
		 */

		Assert.assertTrue(impressiveOption.isSelected());
		String impressiveSelectedMsg = impressiveSelectMsg.getText();
		Assert.assertEquals(impressiveSelectedMsg, "You have checked Impressive");
		System.out.println(impressiveSelectedMsg);

		driver.quit();

	}

}
