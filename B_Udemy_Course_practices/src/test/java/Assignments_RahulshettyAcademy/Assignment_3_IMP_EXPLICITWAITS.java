package Assignments_RahulshettyAcademy;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3_IMP_EXPLICITWAITS {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		WebElement usertype = driver.findElement(By.xpath("//span[text()=' User']"));
		usertype.click();
		usertype.isSelected();
		
//		WebDriver wait (Explicit wait)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn']")));
		System.out.println("Alert received for selecting ''user'' as user type:" + driver.findElement(By.className("modal-body")).getText());
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();

		Select optns = new Select(driver.findElement(By.cssSelector("select.form-control")));
		// optns.selectByIndex(1);
		optns.selectByValue("teach");
		System.out.println("Selected role:" + optns.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.cssSelector("input[id='signInBtn")).click();

//		String[] itemsreq = {"iphone", "Samsung", "Nokia","Blackberry"};
		int j = 0;
		// Add items to cart
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		List<WebElement> items = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < items.size(); i++) {

//			String opts = items.get(i).getText();//split(" ");
//			String finaloptns = opts[0].trim();
//			List<String> itemsreqd = Arrays.asList(itemsreq);
//			if (itemsreqd.contains(finaloptns)) {

				driver.findElements(By.xpath("//button[@class='btn btn-info']"))
						.get(i).click();

//				if (j == itemsreq.length) {
//					break;

//				}
//			}

		}
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='nav-item active']")));
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();	

		List<WebElement> selectedItems = driver.findElements(By.cssSelector("h4.media-heading"));
		
		for(int k =0;k<selectedItems.size();k++) {
			
			System.out.println("Items added to cart :" + selectedItems.get(k).getText());
		}
		driver.findElement(By.cssSelector("button.btn-success")).click();
		
		driver.close();
		

	}

}
