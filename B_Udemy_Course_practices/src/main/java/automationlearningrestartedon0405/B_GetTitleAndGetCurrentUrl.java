package automationlearningrestartedon0405;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B_GetTitleAndGetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.chrome.com/docs/chromedriver/get-started");

		String title = driver.getTitle();
		System.out.println("Title:" + title);

		String url = driver.getCurrentUrl();
		System.out.println("URL:" + url);

		Thread.sleep(2000);
		driver.close();

	}

}
