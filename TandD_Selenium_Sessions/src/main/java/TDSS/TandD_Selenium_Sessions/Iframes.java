package TDSS.TandD_Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Iframes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		WebElement dragDropFrmae = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(dragDropFrmae);

		WebElement dragEle = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement dropEle = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		  Point  axis = dragEle.getLocation();
		  axis.getX();
		  axis.getY();

		Actions action = new Actions(driver);
		action.dragAndDrop(dragEle, dropEle).perform();

		WebElement droppedEle = driver.findElement(By.xpath("//p[contains(text(), 'Dropped!')]"));

		Assert.assertTrue(droppedEle.isDisplayed());
		System.out.println(droppedEle.getText());

//		Switch out of the iframes
		driver.switchTo().parentFrame();

		driver.findElement(By.cssSelector(".demo-list"));
		WebElement eleOutOfFrame = driver.findElement(By.xpath("//a[contains(text(),'Default functionality')]"));
		eleOutOfFrame.click();
		System.out.println(driver.getCurrentUrl());

		driver.close();

	}
}
