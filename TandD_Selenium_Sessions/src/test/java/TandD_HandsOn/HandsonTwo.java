package TandD_HandsOn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandsonTwo {
	WebDriver driver;
	Actions a;
	JavascriptExecutor jse;
	WebDriverWait wait;
	
	@Parameters("browser")
	@BeforeClass
	public void browserSetUp(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Entered invalid browser");
		}

		driver.manage().window().maximize();
	}

	@Test(enabled = false)
	public void guruDemo99() {
//		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		a = new Actions(driver);
		jse = (JavascriptExecutor) driver;
		WebElement tablehead = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/thead/tr"));
		String tableheaders = tablehead.getText();
		System.out.println(tableheaders);
		WebElement powerFincoEle = driver.findElement(By.xpath(
				"//td/a[normalize-space('Power Finance Co') and contains(text(),'Power Finance Co')]/ancestor::tr"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(powerFincoEle));
		jse.executeScript("arguments[0].scrollIntoView(true);", powerFincoEle);
		String pwrFincoStockDetails = powerFincoEle.getText();
		System.out.println(pwrFincoStockDetails);
//		driver.close();

	}

	@Test(enabled = false)
	public void rediff() {
		System.out.println("Second handson on rediff website");
		driver.get("https://money.rediff.com/tools/forex");
		WebElement sgdEle = driver.findElement(By.xpath("//td[contains(text(),'Singapore Dollar (SGD)')]/parent::tr"));
		jse.executeScript("arguments[0].scrollIntoView(true);", sgdEle);
		String sgdRate = sgdEle.getText();
//		String[] sgdAndRate = sgdRate.split(" ");
//		String [] singpore = sgdAndRate[1].split(")");
//		String []dollar = singpore[1].split(" ");
//		System.out.println("singpore dollar" + ": "+ dollar[1]);
		System.out.println(sgdRate);

	}

	@Test (enabled =false)
	public void emiCalculator() {

		System.out.println("Print the months in 2030 calender year from EMI Calculator website");

		driver.get("https://emicalculator.net/home-loan-emi-calculator/");
		WebElement homeValueEle = driver.findElement(By.xpath("//input[@id='homeprice']"));
		homeValueEle.clear();
		homeValueEle.sendKeys("1000000");

		WebElement downPaymentEle = driver.findElement(By.xpath("//input[@id='downpayment']"));
		downPaymentEle.clear();
		downPaymentEle.sendKeys("10");

		WebElement insuranceEle = driver.findElement(By.xpath("//input[@id='homeloaninsuranceamount']"));
		insuranceEle.clear();
		insuranceEle.sendKeys("1000000");

		WebElement homeLoanAmountEle = driver.findElement(By.xpath("//input[@id='homeloanamount']"));
		homeLoanAmountEle.clear();
		homeLoanAmountEle.sendKeys("1900000");

		WebElement loanIntrestEle = driver.findElement(By.xpath("//input[@id='homeloaninterest']"));
		loanIntrestEle.clear();
		loanIntrestEle.sendKeys("5");

		WebElement loanTenureEle = driver.findElement(By.xpath("//input[@id='homeloanterm']"));
		loanTenureEle.click();
		loanTenureEle.clear();
		loanTenureEle.sendKeys("20");

		WebElement loanfeesEle = driver.findElement(By.xpath("//input[@id='loanfees']"));
		loanfeesEle.clear();
		loanfeesEle.sendKeys("0.2");

		WebElement startmonthyearEle = driver.findElement(By.xpath("//input[@id='startmonthyear']"));
		startmonthyearEle.click();

		WebElement yearEle = driver.findElement(By.xpath(
				"//div[@class='datepicker-months']//th[@class='datepicker-switch' and contains(text(),'2026')]"));
		yearEle.click();

		WebElement twentythiryEle = driver
				.findElement(By.xpath("//span[@class='year new' and contains(text(),'2030')]"));
		twentythiryEle.click();

		WebElement calenderEle = driver
				.findElement(By.xpath("//span[@class='month' and contains(text(),'Jan')]/parent::td"));
		String calender = calenderEle.getText();
		System.out.println(calender);

	}
	@Test
	public void yearWiseEMI() throws InterruptedException {
		

		driver.get("https://emicalculator.net/home-loan-emi-calculator/");
		WebElement homeValueEle = driver.findElement(By.xpath("//input[@id='homeprice']"));
		homeValueEle.clear();
		homeValueEle.sendKeys("1000000");

		WebElement downPaymentEle = driver.findElement(By.xpath("//input[@id='downpayment']"));
		downPaymentEle.clear();
		downPaymentEle.sendKeys("10");

		WebElement insuranceEle = driver.findElement(By.xpath("//input[@id='homeloaninsuranceamount']"));
		insuranceEle.clear();
		insuranceEle.sendKeys("1000000");

		WebElement homeLoanAmountEle = driver.findElement(By.xpath("//input[@id='homeloanamount']"));
		homeLoanAmountEle.clear();
		homeLoanAmountEle.sendKeys("1900000");

		WebElement loanIntrestEle = driver.findElement(By.xpath("//input[@id='homeloaninterest']"));
		loanIntrestEle.clear();
		loanIntrestEle.sendKeys("5");

//		WebElement loanTenureEle = driver.findElement(By.xpath("//input[@id='homeloanterm']"));
//		Thread.sleep(5000);
//		loanTenureEle.clear();
//		loanTenureEle.sendKeys("20");

		WebElement loanfeesEle = driver.findElement(By.xpath("//input[@id='loanfees']"));
		loanfeesEle.clear();
		loanfeesEle.sendKeys("0.2");

		WebElement startmonthyearEle = driver.findElement(By.xpath("//input[@id='startmonthyear']"));
		startmonthyearEle.click();

//		WebElement yearEle = driver.findElement(By.xpath(
//				"//div[@class='datepicker-months']//th[@class='datepicker-switch' and contains(text(),'2026')]"));
//		yearEle.click();
//		
		WebElement calenderEle = driver
				.findElement(By.xpath("//span[@class='month' and contains(text(),'Jun')]"));
		calenderEle.click();
		
		
		WebElement yearWiseEMIHeaders = driver.findElement(By.xpath("//div[@id='paymentschedule']/table[@class='noextras']//tr[@class='row no-margin'][1]"));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",yearWiseEMIHeaders);
		System.out.print(yearWiseEMIHeaders.getText());
		
		List<WebElement> yearEMIDeatils = driver.findElements(By.xpath("//div[@id='paymentschedule']//tr[@class='row no-margin yearlypaymentdetails']"));
		yearEMIDeatils.getLast();
		
	}
}
