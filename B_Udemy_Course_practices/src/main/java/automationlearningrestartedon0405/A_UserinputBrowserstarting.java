package automationlearningrestartedon0405;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_UserinputBrowserstarting {
	

	public static void openwebdriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		driver.manage().window().maximize();
		driver.close();
}
	
    public static void Userinput() throws InterruptedException {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the browser name");
    	 String browser = sc.nextLine();
    	  WebDriver driver= null;
    	  
    	  if(browser.equals("Edge")) {
    		   System.setProperty("webdriver.gecko.driver",
    		"C:\\Users\\2164624\\eclipse\\eclipse\\selenium-for-beginners\\src\\main\\resources\\msedgedriver.exe");
    		  driver = new EdgeDriver();
    	  }else if(browser.equals("chrome")) {
    		  WebDriverManager.chromedriver().setup();
    			WebDriver driver1 = new ChromeDriver();
    		  driver1 = new ChromeDriver();
    	  } else {
    		  System.out.println("Invalid browser");
    		  Thread.sleep(2000);
    		  driver.close();
			
    	  }
    }
      public static void main(String[] args) throws InterruptedException {
        	Userinput();
        	
        }
       }
	
	

