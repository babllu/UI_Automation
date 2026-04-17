package webpractices_rahulshettyacademy.com;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vegies_add_to_cart {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		int j = 0;

		String[] reqitems = {"Tomato", "Brocolli", "Beetroot", "Nuts Mixture", "Carrot"};

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] pName = products.get(i).getText().split("-");
			String finalname = pName[0].trim();

			// format it to get actual vegetable name

			// convert input products array into array list for easy search
			
			// check whether extracted product name is present in arrayList or
			// not-

			List<String> itemsreqrd = Arrays.asList(reqitems);

			if (itemsreqrd.contains(finalname)) {

				// click on Add to cart
				List<WebElement> select = driver.findElements(
						By.xpath("//div[@class='product-action']/button"));
				select.get(i).click();

				if (j == reqitems.length) {
					break;

				}

			}
			// System.out.println();
		}
		driver.findElement(By.cssSelector("a.cart-icon")).click();

		// driver.close();
	}

}
