package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	   public static WebDriver OpenBrowser() {
		  WebDriverManager.chromedriver().setup();
		 // System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();  
		   return driver;
		   
		   
		 		   
		   
		      
	}
		
}
