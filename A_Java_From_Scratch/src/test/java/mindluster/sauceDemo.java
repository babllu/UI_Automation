package mindluster;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sauceDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		Date currentdate = new Date();
		// System.out.println(currentdate);
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);

		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).click();
		Thread.sleep(100);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));

	}

}
