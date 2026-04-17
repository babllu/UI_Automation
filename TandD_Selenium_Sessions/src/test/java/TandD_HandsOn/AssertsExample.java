package TandD_HandsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test

public class AssertsExample {

	public void asserts() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://workspace.google.com/intl/en-US/gmail/");
		
		SoftAssert asrt = new SoftAssert();
		

		String actualTitle = driver.getTitle();

		String title = "Gmal: Secure, AI-Powered Email for Everyone | Google Workspace";
		String title1 = "Gmail: Secure, AI-Powered Email for Everyone | Google Workspace";

		asrt.assertEquals(actualTitle, title, "Both the titles are not maching");
		
		Assert.assertEquals(actualTitle, title1, "Both the titles are maching");
		
		asrt.assertAll();


	}

}
