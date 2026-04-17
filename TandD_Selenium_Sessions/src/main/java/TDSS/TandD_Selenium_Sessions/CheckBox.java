package TDSS.TandD_Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox {

	WebDriver driver;

	@Test
	public void multipleCheckBoxs() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		WebElement mainDropdownL1 = driver.findElement(By.xpath("//li[@id='bs_1']/span[@class ='plus']"));
		WebElement mainL1 = driver.findElement(By.id("c_bs_1"));

		WebElement subdropdownL1 = driver.findElement(By.xpath("//li[@id='bf_1']/span[@class='plus']"));
		WebElement subL1 = driver.findElement(By.id("c_bf_3"));
		WebElement lowL1 = driver.findElement(By.xpath("//ul[@id=\"bf_l_1\"]//input[@id=\"c_io_1\"]"));
		WebElement lowL2 = driver.findElement(By.xpath("//ul[@id=\"bf_l_1\"]//input[@id=\"c_io_2\"]"));
		WebElement lowL3 = driver.findElement(By.xpath("//ul[@id=\"bf_l_1\"]//input[@id=\"c_io_3\"]"));
		WebElement lowL4 = driver.findElement(By.xpath("//ul[@id=\"bf_l_1\"]//input[@id=\"c_io_4\"]"));

		WebElement subdropdownL2 = driver.findElement(By.xpath("//li[@id='bf_2']/span[@class='plus']"));
		WebElement subL2 = driver.findElement(By.id("c_bf_2"));
		WebElement lowL5 = driver.findElement(By.xpath("//ul[@id=\"bf_l_2\"]//input[@id=\"c_io_5\"]"));
		WebElement lowL6 = driver.findElement(By.xpath("//ul[@id=\"bf_l_2\"]//input[@id=\"c_io_6\"]"));
		WebElement lowL7 = driver.findElement(By.xpath("//ul[@id=\"bf_l_2\"]//input[@id=\"c_io_7\"]"));
		WebElement lowL8 = driver.findElement(By.xpath("//ul[@id=\"bf_l_2\"]//input[@id=\"c_io_8\"]"));

		WebElement mainDropdownL2 = driver.findElement(By.xpath("//li[@id='bs_2']/span[@class ='plus']"));
		WebElement mainL2 = driver.findElement(By.id("c_bs_2"));

		WebElement subdropdownL3 = driver.findElement(By.xpath("//li[@id='bf_3']/span[@class='plus']"));
		WebElement subL3 = driver.findElement(By.id("c_bf_3"));
		WebElement lowL9 = driver.findElement(By.xpath("//ul[@id=\"bf_l_3\"]//input[@id=\"c_io_9\"]"));
		WebElement lowL10 = driver.findElement(By.xpath("//ul[@id=\"bf_l_3\"]//input[@id=\"c_io_10\"]"));
		WebElement lowL11 = driver.findElement(By.xpath("//ul[@id=\"bf_l_3\"]//input[@id=\"c_io_11\"]"));
		WebElement lowL12 = driver.findElement(By.xpath("//ul[@id=\"bf_l_3\"]//input[@id=\"c_io_12\"]"));

		WebElement subdropdownL4 = driver.findElement(By.xpath("//li[@id='bf_4']/span[@class='plus']"));
		WebElement subL4 = driver.findElement(By.id("c_bf_4"));
		WebElement lowL13 = driver.findElement(By.xpath("//ul[@id=\"bf_l_4\"]//input[@id=\"c_io_13\"]"));
		WebElement lowL14 = driver.findElement(By.xpath("//ul[@id=\"bf_l_4\"]//input[@id=\"c_io_14\"]"));
		WebElement lowL15 = driver.findElement(By.xpath("//ul[@id=\"bf_l_4\"]//input[@id=\"c_io_15\"]"));
		WebElement lowL16 = driver.findElement(By.xpath("//ul[@id=\"bf_l_4\"]//input[@id=\"c_io_16\"]"));

		mainDropdownL2.click();
		Assert.assertTrue(mainDropdownL2.isEnabled(), "Main Drop down 2 is not Enabled");
		subdropdownL4.click();
		Assert.assertTrue(subdropdownL4.isEnabled(), "Sub drop down 4 is not Enabled");
		lowL15.click();
		Assert.assertTrue(lowL15.isSelected());

		mainDropdownL1.click();
		Assert.assertTrue(mainDropdownL1.isEnabled(), "Main Drop down 2 is not Enabled");
		subdropdownL1.click();
		subdropdownL2.click();
		Assert.assertTrue(subdropdownL2.isEnabled(), "Sub drop down 4 is not Enabled");
		lowL3.click();
		Assert.assertTrue(lowL3.isSelected());

//		lowL7.click();

		Actions a = new Actions(driver);
		a.moveToElement(lowL7).click().perform();
		Assert.assertTrue(lowL7.isSelected());

		a.moveToElement(lowL15).click().perform();
		Assert.assertFalse(lowL15.isSelected(), "is selected");

		driver.quit();
	}

}
