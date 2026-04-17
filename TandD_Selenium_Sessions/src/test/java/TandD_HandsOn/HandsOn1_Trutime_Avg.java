package TandD_HandsOn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandsOn1_Trutime_Avg {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new EdgeDriver();
		driver.get("https://onecognizant.cognizant.com/Home");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement oneCLogo = driver.findElement(By.xpath("//a[text()='OneCognizant']"));
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='oneC_searchLanding']"));

//		verifying logo method 1
		System.out.println("verifying the oneCognizant Logo");
		if (oneCLogo.isDisplayed()) {
			System.out.println(oneCLogo.getText());
		} else {
			System.out.println("logo is not present");
		}
		
//		SEARCH TRUTIME IN SEARCH BOX
		searchBox.sendKeys("TruTime");
		searchBox.click();
		WebElement launchButton = driver.findElement(By.xpath("//div[@id='directLaunchbtn']/button[contains(text(),'Launch Now')]"));
		launchButton.click();

////		SITCH TO FRMAE 
//		List<WebElement> frame = driver.findElements(By.id("appFrame"));
//		if (frame.size() > 0) {
//			driver.switchTo().frame("appFrame");
//
//		}

//		 driver.switchTo().frame("subFrame");
		
		WebElement  monthAverage = driver.findElement(By.xpath(
				"//*[normalize-space(text())='Month Avg.']/parent::*//*[@id='A2' and contains(text(),'h') and contains(text(),'m')]"));
		System.out.println(monthAverage.getText());
		
		WebElement yearAVG = driver
				.findElement(By.xpath("//div[@class=\"yrAvg display-inline-block\"]/div[text()='Year Avg.']"));
		wait.until(ExpectedConditions.visibilityOf(yearAVG));
		String yearAvg = yearAVG.getText();
		System.out.println(yearAvg);
		WebElement yearAvgHours = driver.findElement(By.xpath("//div/div[@id='A3']"));
		wait.until(ExpectedConditions.visibilityOf(yearAvgHours));
		String yearavgHours = yearAvgHours.getText();
		System.out.println(yearavgHours);

		WebElement curntMonth = driver.findElement(By.xpath("//div[contains(@class,'month-input-container')]"));

		System.out.println(curntMonth);
//		
		driver.quit();
	}
//
}
