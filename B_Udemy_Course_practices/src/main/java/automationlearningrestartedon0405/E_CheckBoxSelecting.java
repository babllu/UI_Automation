package automationlearningrestartedon0405;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CheckBoxSelecting {

// checkbox selecting:

	public static void singleValueSelecting() {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://total-qa.com/checkbox-example/");
		driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]")).click();

	}

	public static void doubleValueSelecting() {

		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox/");
		/*
		 * List<WebElement> x=
		 * driver.findElements(By.xpath("//input{@typr='checkbox'}")); for (WebElement
		 * x1:x) { x1.click();
		 */

		List<WebElement> chkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		int size = chkboxes.size();

		for (int i = 0; i < size; i++) {

			chkboxes.get(i).click();
		}

	}

	public static void main(String[] args) {

		// singleValueSelecting();
		doubleValueSelecting();

	}

}
