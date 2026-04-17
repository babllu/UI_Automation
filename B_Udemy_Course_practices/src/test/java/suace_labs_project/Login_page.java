package suace_labs_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page extends Suacelabs_web {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");

		// driver.findElement(By.linkText("<a
		// href=\"https://saucelabs.com/sign-up\" class=\"block text-center link
		// link--inline\">Try for free</a>")
		driver.findElement(By.linkText("Try for free")).click();

		driver.findElement(By.id("signUpWithEmail")).click();

	}
}